package shoutua.calculator.model;

public class Digital implements Token {

	private double value;

	public double getValue() {
		return value;
	}

	public Digital(double d) {
		this.value = d;
	}

	public int getPriority() {
		return -3;
	}

}