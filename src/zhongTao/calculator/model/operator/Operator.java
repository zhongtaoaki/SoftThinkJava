package zhongTao.calculator.model.operator;

import zhongTao.calculator.exception.CalculateException;
import zhongTao.calculator.model.Token;

public abstract class Operator implements Token {

	/**
	 * 計算を行う
	 * 
	 * @param double a
	 * @param double b
	 * @return double 結果
	 * @throws CalculateException
	 */
	public abstract double calculate(double a, double b) throws CalculateException;
}
