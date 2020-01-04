package zhongTao.calculator.model;

import zhongTao.calculator.exception.TokenException;
import zhongTao.calculator.model.operator.Add;
import zhongTao.calculator.model.operator.Devide;
import zhongTao.calculator.model.operator.Minus;
import zhongTao.calculator.model.operator.Multiply;

public class TokenFactory {

	public Token getToken(char c, int index) throws TokenException {
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
		default:
			throw new TokenException("第" + index + "桁の文字:" + c + "は認識されません。もう一度確認ください。");
		}
	}

	public Token getToken(StringBuffer tokenString) {
		return new Digital(Double.parseDouble(tokenString.toString()));
	}

	public Token getToken(Double d) {
		return new Digital(d);
	}

}
