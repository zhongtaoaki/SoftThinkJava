package xiangTao;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class calculatorExp {
	// 入力された四則演算list
	private char[] array;
	// 演算子stack
	Stack<Character> operator = new Stack<Character>();
	// 逆ポーランド式List
	LinkedList<String> calList = new LinkedList<String>();

	// 四則演算を入力
	public void inputArithmeticExp() {
		Scanner in = new Scanner(System.in);
		System.out.println("四則演算を入力してください");
		String str = in.nextLine();
		// 文字配列として保存
		array = str.toCharArray();
		in.close();
	}

	// 逆ポーランド式に変換
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
					calList.add(String.valueOf(operator.pop()));
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
					calList.add(String.valueOf(operator.pop()));
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
					calList.add(String.valueOf(operator.pop()));
					operator.push(array[i]);
				}
				break;
			case ' ':
				break;
			// 数値の場合、逆ポーランド式Listに入れる
			default:
//				calList.add(String.valueOf(array[i]));
				if (0 < i && '0' <= array[i - 1] && array[i - 1] <= '9') {
					calList.add(String.valueOf(calList.removeLast()) + String.valueOf(array[i]));
					break;
				} else {
					calList.add(String.valueOf(array[i]));
					break;
				}
			}
		}
		// 入力された四則演算listは一つずつ判断し終わった、演算子stack中にまだ演算子があると、引き出して逆ポーランド式Listに入れる
		while (!operator.empty()) {
			calList.add(String.valueOf(operator.pop()));
		}

	}

	// 逆ポーランド式を出力
	public void printArithmeticExp() {
		System.out.println("逆ポーランド式：\n" + calList);
	}

	// 逆ポーランド式を計算
	public void calculateArithmeticExp() {
		Stack<Double> result = new Stack<Double>();
		double firstNum = 0d;
		double secondNum = 0d;
		for (int i = 0; i < calList.size(); i++) {
				// 文字の場合、演算子を判断し、計算して、数値stackに入れる
				switch (calList.get(i)) {
				
				default:
					// 逆ポーランド式左からの数値をstackに保存
					result.push(Double.valueOf(calList.get(i)));
					break;
				
				case "+":
					firstNum = result.pop();
					secondNum = result.pop();
					result.push(secondNum + firstNum);
					break;

				case "-":
					firstNum = result.pop();
					secondNum = result.pop();
					result.push(secondNum - firstNum);
					break;

				case "*":
					firstNum = result.pop();
					secondNum = result.pop();
					result.push(secondNum * firstNum);
					break;

				case "/":
					firstNum = result.pop();
					secondNum = result.pop();
					result.push(secondNum / firstNum);
					break;
			}
		}
		// 最後の結果を出力
		System.out.println(result.pop());
	}

	public static void main(String[] args) {
		calculatorExp calculatorExp = new calculatorExp();
		// 四則演算を入力
		calculatorExp.inputArithmeticExp();
		// 逆ポーランド式に変換
		calculatorExp.changArithmeticExp();
		// 逆ポーランド式を出力
		calculatorExp.printArithmeticExp();
		// 演算を計算
		calculatorExp.calculateArithmeticExp();
	}
}
