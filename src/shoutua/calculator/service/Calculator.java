package shoutua.calculator.service;

import java.util.List;
import java.util.Stack;

import shoutua.calculator.model.Digital;
import shoutua.calculator.model.Operator;
import shoutua.calculator.model.Token;

public class Calculator {

	/**
	 * 
	 * @param List<Token>
	 * @return double
	 */
	public double calculate(final List<Token> tokens) {
		Stack<Double> stack = new Stack<Double>();
		tokens.forEach(t -> {
			if (t instanceof Operator) {
				// 演算子の場合
				stack.push(((Operator) t).calculate(stack.pop(), stack.pop()));
			} else {
				// 被演算数の場合
				stack.push(((Digital) t).getValue());
			}
		});
		return stack.pop();
	}
}
