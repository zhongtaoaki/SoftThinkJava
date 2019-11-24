package syuu.java_practice_2;

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

	@Override
	public void playProgram() {
		System.out.println("白黒テレビです。");
		super.playProgram();
	}
}
