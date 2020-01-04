package zhongTao.calculator.model;

public class RightBracket implements Token {

	public int getPriority() {
		return Priority.rightBracket.getValue();
	}

}