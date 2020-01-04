package zhongTao.calculator.service;

import java.util.List;
import java.util.Stack;

import zhongTao.calculator.exception.CalculateException;
import zhongTao.calculator.model.Digital;
import zhongTao.calculator.model.Token;
import zhongTao.calculator.model.operator.Operator;

public class Calculator {

	/**
	 * 計算を行う
	 * 
	 * @param List<Token>
	 * @return double 計算した結果
	 */
	public double calculate(final List<Token> tokens) {
		Stack<Double> stack = new Stack<Double>();
		tokens.forEach(t -> {
			if (t instanceof Operator) {
				// 演算子の場合
				try {
					stack.push(((Operator) t).calculate(stack.pop(), stack.pop()));
				} catch (CalculateException e) {
					e.printStackTrace();
				}
			} else {
				// 被演算数の場合
				stack.push(((Digital) t).getValue());
			}
		});
		return stack.pop();
	}
}
