package xiangTao;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class calculator {
	//入力された四則演算list
	private char[] array;
	//演算子stack
	Stack<Character> operator = new Stack<Character>();
	//逆ポーランド式List
	LinkedList<Character> calList = new LinkedList<Character>();

	// 四則演算を入力
	public void inputArithmeticExp() {
		Scanner in = new Scanner(System.in);
		System.out.println("四則演算を入力してください");
		String str = in.nextLine();
		//文字配列として保存
		array = str.toCharArray();
		in.close();
	}

	//逆ポーランド式に変換
	public void changArithmeticExp() {
		// 一つずつ文字を判断
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			// '('の場合、演算子のstackにpushする
			case '(':
				operator.push(array[i]);
				break;
			// ')'の場合、演算子stack中の演算子を'('まで引き出して、逆ポーランド式Listに入れる、最後は')'を捨てる
			case ')':
				while (operator.peek() != '(') {
					calList.add(operator.pop());
				}
				operator.pop();
				break;
			// '+''-'の場合、演算子stack中の一番上の演算子と優先順位で比べる
			case '+':
			case '-':
				// 演算子stackは空或いはその中の一番上の演算子は'('の場合、演算子stackに新しい演算子を入れる
				if (operator.empty() || operator.peek() == '(') {
					operator.push(array[i]);
				} else {
					// 以外の場合、演算子stack中の演算子を引き出して、逆ポーランド式Listに入れる、または演算子stackに新しい演算子を入れる
					calList.add(operator.pop());
					operator.push(array[i]);
				}
				break;
			// '*''/'の場合、演算子stack中の一番上の演算子と優先順位で比べる
			case '*':
			case '/':
				// '*''/'の優先順位が高い場合
				if (operator.empty() || operator.peek() == '(' || operator.peek() == '+' || operator.peek() == '-') {
					operator.push(array[i]);
				} else {
					calList.add(operator.pop());
					operator.push(array[i]);
				}
				break;
			case ' ':
				break;
			// 数値の場合、逆ポーランド式Listに入れる
			default:
				calList.add(array[i]);
			}
		}
		// 入力された四則演算listは一つずつ判断し終わった、演算子stack中にまだ演算子があると、引き出して逆ポーランド式Listに入れる
		while (!operator.empty()) {
			calList.add(operator.pop());
		}

	}

	// 逆ポーランド式を出力
	public void printArithmeticExp() {
		System.out.println("逆ポーランド式：\n" + calList);
	}

	// 逆ポーランド式を計算
	public void calculateArithmeticExp() {
		Stack<Integer> result = new Stack<Integer>();
		int firstNum = 0;
		int secondNum = 0;
		for (int i = 0; i < calList.size(); i++) {
			//逆ポーランド式左からの数値をstackに保存
			if (calList.get(i) >= '0' && calList.get(i) <= '9') {
				result.push(calList.get(i) - '0');
			} else {
				//文字の場合、演算子を判断し、計算して、数値stackに入れる
				firstNum = result.pop();
				secondNum = result.pop();
				
				switch (calList.get(i)) {

				case '+':
					result.push(secondNum + firstNum);
					break;

				case '-':
					result.push(secondNum - firstNum);
					break;

				case '*':
					result.push(secondNum * firstNum);
					break;

				case '/':
					result.push(secondNum / firstNum);
					break;

				default:
					break;
				}
			}
		}
		//最後の結果を出力
		System.out.println(result.pop());
	}

	public static void main(String[] args) {
		calculator calculator = new calculator();
		//四則演算を入力
		calculator.inputArithmeticExp();
		//逆ポーランド式に変換
		calculator.changArithmeticExp();
		//逆ポーランド式を出力
		calculator.printArithmeticExp();
		//演算を計算
		calculator.calculateArithmeticExp();
	}
}
