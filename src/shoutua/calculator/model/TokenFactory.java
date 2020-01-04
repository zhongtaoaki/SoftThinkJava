package shoutua.calculator.model;

import shoutua.calculator.model.operator.Add;
import shoutua.calculator.model.operator.Devide;
import shoutua.calculator.model.operator.Minus;
import shoutua.calculator.model.operator.Multiply;

public class TokenFactory {

	public Token getToken(char c) {
		switch (c) {
		case '+':
			return new Add();
		case '-':
			return new Minus();
		case '*':
			return new Multiply();
		case '/':
			return new Devide();
		case '(':
			return new LeftBracket();
		case ')':
			return new RightBracket();
		}
		return null;
	}

	public Token getToken(StringBuffer tokenString) {
		return new Digital(Double.parseDouble(tokenString.toString()));
	}

	public Token getToken(Double d) {
		return new Digital(d);
	}

}
