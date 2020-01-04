package xiangTao.television;

import xiangTao.television.Television.Direct;

public class Main {

	public static void main(String[] args) {
//		System.out.println("どんなテレビを使いたいですか？１．白黒テレビ、２．カラーテレビ");
//		Scanner scanner = new Scanner(System.in);
//		int setType = scanner.nextInt();
//		if (setType == 1) {
//			MonochromeTV monochromeTV = new MonochromeTV(55);
//			System.out.println("チャンネルを設定する");
//			Scanner channel = new Scanner(System.in);
//			monochromeTV.play(scanner.nextInt());
//			
//			
//		} else {
//			ColorfulTV colorfulTV = new ColorfulTV(28);
//			System.out.println("チャンネルを設定する");
//			colorfulTV.play(scanner.nextInt());
//		}

		MonochromeTV monochromeTV = new MonochromeTV(55);
//		monochromeTV.operateVolume(Direct.UP);
//		monochromeTV.operateVolume(Direct.UP);
//		System.out.println(monochromeTV.getVolume());
//		monochromeTV.operateChannel(Direct.UP);
//		monochromeTV.operateChannel(Direct.UP);
//		System.out.println(monochromeTV.getChannel());
//		monochromeTV.play(monochromeTV.getChannel());
//		monochromeTV.play(monochromeTV.getChannel());
		monochromeTV.play(12);
		monochromeTV.operateChannel(Direct.UP);
		System.out.println(monochromeTV.getChannel());

	}

}
