package television;

public class ColorfulTV extends Television {

	//size���擾
	public ColorfulTV(int size){
		super(size);
	}

	//�J���[�e���r�̃f�B�t�H���g����
	@Override
	public void play() {

	}	

	//�`�����l����ݒ�A�`�F���W
	@Override
	public void play(int setChannel) {
		System.out.println("�e���r�ԑg"+setChannel+"�����J�n");		
		
	}

}
