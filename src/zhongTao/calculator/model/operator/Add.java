package zhongTao.calculator.model.operator;

import zhongTao.calculator.model.Priority;

public class Add extends Operator {

	@Override
	public int getPriority() {
		return Priority.add.getValue();
	}

	@Override
	public double calculate(double a, double b) {
		return a + b;
	}

}