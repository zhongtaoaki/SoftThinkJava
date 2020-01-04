package shoutua.calculator.model.operator;

import shoutua.calculator.model.Operator;

public class Minus extends Operator {

	@Override
	public int getPriority() {
		return 0;
	}

	public double calculate(double a, double b) {
		return a - b;
	}
}