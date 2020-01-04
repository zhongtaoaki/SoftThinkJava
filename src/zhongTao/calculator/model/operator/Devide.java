package zhongTao.calculator.model.operator;

import zhongTao.calculator.exception.CalculateException;
import zhongTao.calculator.model.Priority;

public class Devide extends Operator {

	@Override
	public int getPriority() {
		return Priority.devide.getValue();
	}

	@Override
	public double calculate(double a, double b) throws CalculateException {
		if (a == 0) {
			throw new CalculateException("除数は0です");
		} else {
			return b / a;
		}
	}
}