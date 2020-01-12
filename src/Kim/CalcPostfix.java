package Kim;

import java.util.ArrayList;
import java.util.Stack;

public class CalcPostfix {
	public static void main(String[] args) {
		getcalculate("-3*(-3+5)+-5*2");
		getcalculate("-10 * 3-5");
		getcalculate("-10 -5");

	}
	
	public static void getcalculate(String content) {
		double result = calculate(postfix(content));
		System.out.println(content + " = " + result);
		
	}

	public static ArrayList<String> postfix(String content) {
		content = content.replace(" ", "");

		ArrayList<String> postfixList = new ArrayList<String>();
		Stack<Character> opStack = new Stack<Character>();

		char[] operationCode = { '+', '-', '*', '/', '(', ')' };

		int index = 0;
		boolean checkOpCode;
		for (int i = 1; i < content.length(); i++) {
			checkOpCode = false;

			for (int j = 0; j < operationCode.length; j++) {
				if (content.charAt(i) == operationCode[j]) {
					if ((int) content.charAt(i - 1) >= 48 & (int) content.charAt(i - 1) <= 57) {
						postfixList.add(content.substring(index, i));
						index = i + 1;
						checkOpCode = true;

					} else if (content.charAt(i) == '(' | content.charAt(i) == ')') {
						index = i + 1;
						checkOpCode = true;

					} else if (content.charAt(i - 1) == ')') {
						index = i + 1;
						checkOpCode = true;
					}
				}
			}

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
		}

		postfixList.add(content.substring(index, content.length()));
		if (!opStack.isEmpty()) {
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
		default:
			return -1;
		}
	}

	public static Double calculate(ArrayList<String> postfixList) {
		Stack<Double> calStack = new Stack<Double>();
		double value1, value2;
		for (int i = 0; i < postfixList.size(); i++) {
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
			default:
				calStack.add(Double.valueOf(postfixList.get(i)));
			}
		}
		return calStack.pop();

	}
}
