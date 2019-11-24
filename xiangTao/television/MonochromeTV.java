package television;

public class MonochromeTV extends Television {

	//sizeを設定
	public MonochromeTV(int size){
		super(size);
//		System.out.println("白黒テレビ");			
	}
	
	//白黒テレビのディフォルト放送
	@Override
	public void play() {
		System.out.println("白黒テレビ番組"+getChannel()+"放送開始");		

	}	

	//チャンネルを設定、チェンジ
	@Override
	public void play(int setChannel) {
		super.setChannel(setChannel);
		System.out.println("白黒テレビ番組"+getChannel+"放送開始");		
		
	}
	
}
