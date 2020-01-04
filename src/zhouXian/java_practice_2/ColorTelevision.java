package zhouXian.java_practice_2;

public class ColorTelevision extends Television {

	// 色
	private static boolean color = true;

	/**
	 * コナスタラクター
	 */
	public ColorTelevision(int size) {
		super.setColor(color);
		super.setSize(size);
	}

	/**
	 * 番組を再生する
	 */
	@Override
	public void playProgram() {
		System.out.println("カラーテレビです。");
		super.playProgram();
	}
}
