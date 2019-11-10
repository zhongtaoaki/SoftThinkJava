package java_practice_1;

import java.util.Scanner;

public class PlusMethod_syu {

	/**
	 * メインメソッド
	 * @param arg
	 */
	public static void main(String arg[]) {

		// Scannerオブジェクトを定義
		Scanner in = new Scanner(System.in);

		System.out.println("数値１と数値２の和を求める。");
		// 数値１を取得
		float number1 = checkInput(in, 1);
		// 数値２を取得
		float number2 = checkInput(in, 2);
		// 和を出力する
		System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
	}

	/**
	 * 入力した値をチェックする
	 * @param in
	 * @param index
	 * @return
	 */
	private static float checkInput(Scanner in, int index) {
		// 数値iを入力して下さい・・・・・
		System.out.println("  数値" + index + "を入力・・・・・");
		String numberStr = in.next();
		try {
			float number = Float.parseFloat(numberStr);
			return number;
		} catch (NumberFormatException e) {
			System.out.println("  数値を入力して下さい！");
			checkInput(in, index);
		} finally {

		}
		return 0.0f;
	}

}
