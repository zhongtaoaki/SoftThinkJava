package zhouXian.java_practice_2;

public class Television {

	// サイズ
	private int size;
	// 色
	private boolean color;
	// 音量
	private int volume = 11;
	// チャンネル番号
	private int channel = 7;

	/**
	 * 番組を再生する
	 */
	public void playProgram() {
		System.out.println("サイズは" + size + "です。");
		System.out.println("音量は" + volume + "です。");
		System.out.println("チャンネル：" + channel + "を再生する。");
		System.out.println("====================================");
	}

	/**
	 * 番組を再生する
	 * 
	 * @param channel
	 */
	public void playProgram(int channel) {
		this.channel = channel;
		playProgram();
	}

	/**
	 * チャンネルを変える
	 * 
	 * @param changeType
	 */
	public void changeChannel(String changeType) {
		if ("+".equals(changeType)) {
			// チャンネル番号を増やす
			this.channel += 1;
		} else if ("-".equals(changeType)) {
			// チャンネル番号を減る
			this.channel -= 1;
		}
		// playProgram();
	}

	/**
	 * 音量を調整する
	 * 
	 * @param changeType
	 */
	public void changeVolume(String changeType) {
		if ("+".equals(changeType)) {
			// 音量を増やす
			this.volume += 1;
		} else if ("-".equals(changeType)) {
			// 音量を減る
			this.volume -= 1;
		}
		// playProgram();
	}

	/**
	 * 色を取得する
	 * 
	 * @return
	 */
	public boolean getColor() {
		return color;
	}

	/**
	 * 色を設定する
	 * 
	 * @param color
	 */
	public void setColor(boolean color) {
		this.color = color;
	}

	/**
	 * サイズを取得する
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * サイズを設定する
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
