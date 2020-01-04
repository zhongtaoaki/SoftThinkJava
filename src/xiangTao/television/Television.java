package xiangTao.television;

public abstract class Television {

	// ディフォルト
	private int size;
	private int volume = 0;
	private int channel = 1;

	// ＋－ボタンを作る
	public enum Direct {
		UP, DOWN;
	}

	// sizeを設定
	public Television(int size) {
		this.size = size;
	}

	// 抽象クラス、ディフォルト放送
	public abstract void play();

	// 抽象クラス、チャンネルを設定
	public abstract void play(int setChannel);

	// ボタンを押下、音量をup/down
	public void operateVolume(Direct direct) {
		if (direct == Direct.UP) {
			volume++;
		} else {
			volume--;
		}
	}

	// ボタンを押下、チャンネルをup/dsown
	public void operateChannel(Direct direct) {
		if (direct == Direct.UP) {
			channel++;
		} else {
			channel--;
		}
	}

	// sizeを取得
	public int getSize() {
		return size;
	}

	// volumeを取得
	public int getVolume() {
		return volume;
	}

	// channelを取得
	public int getChannel() {
		return channel;
	}

	public int setChannel(int setChannel) {
		channel = setChannel;
		return channel;
	}

}
