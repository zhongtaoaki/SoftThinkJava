package zhongTao.calculator.model;

public class LeftBracket implements Token {

	public int getPriority() {
		return Priority.leftBracket.getValue();
	}

}