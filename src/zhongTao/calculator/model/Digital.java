package zhongTao.calculator.model;

public class Digital implements Token {

	private double value;

	public double getValue() {
		return value;
	}

	public Digital(double value) {
		this.value = value;
	}

	public int getPriority() {
		return Priority.degital.getValue();
	}

}