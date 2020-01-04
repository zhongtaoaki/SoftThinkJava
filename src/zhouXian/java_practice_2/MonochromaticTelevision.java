package zhouXian.java_practice_2;

public class MonochromaticTelevision extends Television {

	// 色
	private boolean color = false;

	/**
	 * コナスタラクター
	 */
	public MonochromaticTelevision(int size) {
		super.setColor(color);
		super.setSize(size);
	}

	/**
	 * 番組を再生する
	 */
	@Override
	public void playProgram() {
		System.out.println("白黒テレビです。");
		super.playProgram();
	}
}
