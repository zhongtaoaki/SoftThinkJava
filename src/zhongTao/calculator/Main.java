package zhongTao.calculator;

import java.util.ArrayList;
import java.util.List;

import zhongTao.calculator.service.Calculator;
import zhongTao.calculator.service.Formattor;

public class Main {

	public static void main(String[] args) {

		List<String> expresses = new ArrayList<String>();
		expresses.add("1+2 +3");
		expresses.add("(1+3)*5");
		expresses.add("(2+3+4)");
		expresses.add("(3+3)/(-1+3)");

		expresses.forEach(express -> {
			Formattor formattor = new Formattor();
			Calculator calculator = new Calculator();
			double d;
			try {
				d = calculator.calculate(formattor.postfix(formattor.formatIntoTokens(express)));
				System.out.println(express + " = " + d);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}
}
