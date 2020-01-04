package xiangTao.television;

public class ColorfulTV extends Television {

	// sizeを設定
	public ColorfulTV(int size) {
		super(size);
	}

	// カラーテレビのディフォルト放送
	@Override
	public void play() {
		System.out.println("カラーテレビ番組" + getChannel() + "放送開始");

	}

	// チャンネルを設定、チェンジ
	@Override
	public void play(int setChannel) {
		super.setChannel(setChannel);
		// System.out.println("カラーテレビ番組" + getChannel + "放送開始");

	}

}
