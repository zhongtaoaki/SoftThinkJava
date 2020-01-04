package shoutua.calculator.model.operator;

import java.math.BigDecimal;

import shoutua.calculator.model.Operator;

public class Devide extends Operator {

	@Override
	public int getPriority() {
		return 1;
	}

	@SuppressWarnings({ "unused", "deprecation" })
	public double calculate(double a, double b) {
		BigDecimal b1 = new BigDecimal(a);
		BigDecimal b2 = new BigDecimal(b);

		return b1.divide(b2, 3, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}