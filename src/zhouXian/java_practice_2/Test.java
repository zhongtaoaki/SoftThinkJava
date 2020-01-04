package zhouXian.java_practice_2;

public class Test {

	public static void main(String[] args) {

		// カラーテレビ
		ColorTelevision colorTV = new ColorTelevision(24);
		colorTV.changeVolume("+");
		colorTV.changeChannel("+");
		colorTV.playProgram();

		// 白黒テレビ
		MonochromaticTelevision monoTV = new MonochromaticTelevision(32);
		monoTV.changeVolume("-");
		monoTV.changeChannel("-");
		monoTV.playProgram();
	}

}
