package television;

public class MonochromeTV extends Television {

	//size���擾
	public MonochromeTV(int size){
		super(size);
//		System.out.println("�����e���r");			
	}
	
	//�����e���r�̃f�B�t�H���g����
	@Override
	public void play() {
		System.out.println("�e���r�ԑg"+getChannel()+"�����J�n");		

	}	

	//�`�����l����ݒ�A�`�F���W
	@Override
	public void play(int setChannel) {
		System.out.println("�e���r�ԑg"+setChannel+"�����J�n");		
		
	}
	
}
