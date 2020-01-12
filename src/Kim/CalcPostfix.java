package Kim;

import java.util.ArrayList;
import java.util.Stack;

//クラスの拡張性・保守性からいうと命名はよくない
//インターフェースを利用して実装専用にクラスでも良い
public class CalcPostfix {
	
	public static void main(String[] args) {
		
		getcalculate("-3*(-3+5)+-5*2");
		getcalculate("-10 * 3-5");
		getcalculate("-10 -5");
		getcalculate("100 -5");

	}
	
	//getcalculate->getCalculate
	//mainに移動する、あるいは結果を返す
	//static要らない
	public static void getcalculate(String content) {
		
		double result = calculate(postfix(content));
		System.out.println(content + " = " + result);
		
	}

	//ここからのメソッドは公開してはいけない
	public static ArrayList<String> postfix(String content) {
		//演算式のインデックスが変更されてしまうー＞デバッグのため
		content = content.replace(" ", "");
		//ArrayListー＞List、保守性のため
		ArrayList<String> postfixList = new ArrayList<String>();//＜＞の中身いらない
		Stack<Character> opStack = new Stack<Character>();//ここも同様

		char[] operationCode = { '+', '-', '*', '/', '(', ')' };

		int index = 0;
		boolean checkOpCode;
		//できれば拡張forを利用できるように
		for (int i = 1; i < content.length(); i++) {
			checkOpCode = false;

			//int lastChar = content.charAt(i - 1);
			//int 変数名 = content.charAt(i);
			//source is comment
			//dont repeat yourself
			for (int j = 0; j < operationCode.length; j++) {
				//content.charAt(i)はループを依存しないので、変数化すべき：変数名＝content.charAt(i)
				if (content.charAt(i) == operationCode[j]) {
					//＆－＞＆＆
					//↓
					//if(48 <= a && a <= 57) 
					//intの変換がいらない
					if ((int) content.charAt(i - 1) >= 48 & (int) content.charAt(i - 1) <= 57) {
						postfixList.add(content.substring(index, i));
						index = i + 1;
						checkOpCode = true;

						//｜－＞｜｜
					} else if (content.charAt(i) == '(' | content.charAt(i) == ')') {
						index = i + 1;
						checkOpCode = true;

						//条件分岐必要がない
					} else if (content.charAt(i - 1) == ')') {
						index = i + 1;
						checkOpCode = true;
					}
				}
			}

			//演算式の解析（字句解析）と逆ポーランドの処理を分離すべき
			if (checkOpCode) {
				if (opStack.isEmpty() | content.charAt(i) == '(') {
					opStack.push(content.charAt(i));
				} else if (content.charAt(i) == ')') {
					while (true) {
						postfixList.add(opStack.pop().toString());
						if (opStack.pop() == '(' | opStack.isEmpty()) {
							break;
						}
					}

				} else if (opOrder(content.charAt(i)) > opOrder(opStack.peek())) {
					opStack.push(content.charAt(i));
				} else if (opOrder(content.charAt(i)) <= opOrder(opStack.peek())) {
					postfixList.add(opStack.pop().toString());
					opStack.push(content.charAt(i));
				}

			}
			//int lastChar = c;
		}

		postfixList.add(content.substring(index, content.length()));
		if (!opStack.isEmpty()) {//不要な判断
			//i1の命名意味不明
			//while(!opStack.isEmpty())
			for (int i1 = 0; i1 < opStack.size();) {
				postfixList.add(opStack.pop().toString());
			}

		}
		return postfixList;

	}
	
	
	public static int opOrder(char op) {
		switch (op) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		//defaultは予想外のものなので、括弧の処理になってはいけない
		default:
			return -1;
		}
	}

	public static Double calculate(ArrayList<String> postfixList) {
		Stack<Double> calStack = new Stack<Double>();
		double value1, value2;
		for (int i = 0; i < postfixList.size(); i++) {
			//Stringのswitchはよろしくない
			switch (postfixList.get(i)) {
			case "+":
				value1 = calStack.pop();
				value2 = calStack.pop();
				calStack.push(value2 + value1);
				break;
			case "-":
				value1 = calStack.pop();
				value2 = calStack.pop();
				calStack.push(value2 - value1);
				break;
			case "*":
				value1 = calStack.pop();
				value2 = calStack.pop();
				calStack.push(value2 * value1);
				break;
			case "/":
				value1 = calStack.pop();
				value2 = calStack.pop();
				calStack.push(value2 / value1);
				break;
				//上と同様
			default:
				calStack.add(Double.valueOf(postfixList.get(i)));
			}
		}
		return calStack.pop();

	}
}
