package television;

public class ColorfulTV extends Television {

	//sizeを設定
	public ColorfulTV(int size){
		super(size);
	}

	//カラーテレビのディフォルト放送
	@Override
	public void play() {

	}	

	//チャンネルを設定、チェンジ
	@Override
	public void play(int setChannel) {
		System.out.println("テレビ番組"+setChannel+"放送開始");		
		
	}

}
