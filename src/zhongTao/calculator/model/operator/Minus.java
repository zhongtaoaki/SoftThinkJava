package zhongTao.calculator.model.operator;

import zhongTao.calculator.model.Priority;

public class Minus extends Operator {

	@Override
	public int getPriority() {
		return Priority.minus.getValue();
	}

	@Override
	public double calculate(double a, double b) {
		return a - b;
	}
}