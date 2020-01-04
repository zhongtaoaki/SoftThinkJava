package shoutua.calculator.model;

public interface Token {
	/**
	 * <li>+-:0</li>
	 * <li>'*'/:1</li>
	 * <li>(:-1</li>
	 * <li>):-2</li>
	 * <li>num:-3</li>
	 */
	int getPriority();

}