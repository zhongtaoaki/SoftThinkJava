package shoutua.calculator.model.operator;

import shoutua.calculator.model.Operator;

public class Add extends Operator {

	final int priority = 0;

	@Override
	public int getPriority() {
		return priority;
	}

	@Override
	public double calculate(double a, double b) {
		return a + b;
	}

}