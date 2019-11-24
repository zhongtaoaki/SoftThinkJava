package television;

public abstract class Television {

	//�f�B�t�H���g
	private int size;
	private int volume = 0;
	private int channel = 1;
	
	//size���擾
	public Television (int size) {
		this.size = size;
	}
	
	//���ۃN���X�A�f�B�t�H���g����
	public abstract void play();
	//���ۃN���X�A�`�����l����ݒ�
	public abstract void play(int setChannel);
	
	//�{�^���������A���ʂ�up/down
	public void operateVolume(Direct direct) {
		if(direct == Direct.UP) {
			volume++;
		} else {
			volume--;
		}
	}

	//�{�^���������A�`�����l����up/down
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
