package zhongTao.calculator.model.operator;

import zhongTao.calculator.model.Priority;

public class Multiply extends Operator {

	@Override
	public int getPriority() {
		return Priority.multipy.getValue();
	}

	@Override
	public double calculate(double a, double b) {
		return a * b;
	}
}