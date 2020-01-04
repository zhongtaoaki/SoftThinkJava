package shoutua.calculator.model;

public abstract class Operator implements Token {

	/**
	 * 
	 * @param double a
	 * @param double b
	 * @return result
	 */
	public abstract double calculate(double a, double b);
}
