package zhongTao.calculator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import zhongTao.calculator.exception.TokenException;
import zhongTao.calculator.model.Token;
import zhongTao.calculator.model.TokenFactory;

public class Formattor {

	/**
	 * 文字列を解析する
	 * 
	 * @param String
	 * @return List<Token>
	 * @throws TokenException
	 */
	public List<Token> formatIntoTokens(String expression) throws TokenException {
		List<Token> tokens = new ArrayList<Token>();
		char[] chars = expression.toCharArray();

		StringBuffer stringBuffer = new StringBuffer();
		TokenFactory tokenFactory = new TokenFactory();

		// 頭文字の判断
		char c = chars[0];
		if ('0' <= c && c <= '9') {
			stringBuffer.append(c);
		} else if (c != ' ') {
			tokens.add(tokenFactory.getToken(c, 1));
		}

		for (int i = 1; i < chars.length; i++) {
			c = chars[i];
			if (c != ' ') {

				if (('0' <= c && c <= '9') || c == '.') {
					stringBuffer.append(c);
				} else if (c == '-') {
					if (chars[i - 1] == '(') {
						stringBuffer.append(c);
					} else {
						tokens.add(tokenFactory.getToken(stringBuffer));
						stringBuffer.setLength(0);
						tokens.add(tokenFactory.getToken(c, i + 1));
					}
				} else {
					if (stringBuffer.length() > 0) {
						tokens.add(tokenFactory.getToken(stringBuffer));
					}
					stringBuffer.setLength(0);
					tokens.add(tokenFactory.getToken(c, i + 1));
				}
			}
		}
		if (stringBuffer.length() > 0) {
			tokens.add(tokenFactory.getToken(stringBuffer));
		}
		return tokens;

	}

	/**
	 * 逆ポーランドに変換する
	 * 
	 * @param List<Token>
	 * @return List<Token>
	 */
	public List<Token> postfix(List<Token> tokens) {
		Stack<Token> s1 = new Stack<>();
		Stack<Token> s2 = new Stack<>();
		for (Token t : tokens) {
			switch (t.getPriority()) {
			case -3:
				s1.push(t);
				break;
			case -2:
				do {
					s1.push(s2.pop());
				} while (s2.peek().getPriority() != -1);
				s2.pop();
				break;
			default:
				if (s2.empty() || t.getPriority() > s2.peek().getPriority() || t.getPriority() == -1) {
					s2.push(t);
				} else {
					do {
						s1.push(s2.pop());
					} while (s1.peek().getPriority() == 1);
					s2.push(t);
				}
			}
		}
		while (!s1.empty()) {
			s2.push(s1.pop());
		}
		List<Token> tokenList = new ArrayList<>();
		while (!s2.empty()) {
			tokenList.add(s2.pop());
		}
		return tokenList;
	}
}
