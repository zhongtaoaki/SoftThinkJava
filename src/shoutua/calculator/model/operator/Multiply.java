package shoutua.calculator.model.operator;

import shoutua.calculator.model.Operator;

public class Multiply extends Operator {

	@Override
	public int getPriority() {
		return 1;
	}

	public double calculate(double a, double b) {
		return a * b;
	}
}