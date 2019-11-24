package television;

public abstract class Television {

	//ディフォルト
	private int size;
	private int volume = 0;
	private int channel = 1;
	
	//sizeを取得
	public Television (int size) {
		this.size = size;
	}
	
	//抽象クラス、ディフォルト放送
	public abstract void play();
	//抽象クラス、チャンネルを設定
	public abstract void play(int setChannel);
	
	//ボタンを押下、音量をup/down
	public void operateVolume(Direct direct) {
		if(direct == Direct.UP) {
			volume++;
		} else {
			volume--;
		}
	}

	//ボタンを押下、チャンネルをup/down
	public void operateChannel(Direct direct) {
		if(direct == Direct.UP) {
			channel = getChannel() + 1;
		} else {
			channel = getChannel() - 1;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public int getVolume() {
		return volume;
	}

	public int getChannel() {
		return channel;
	}
	
}
