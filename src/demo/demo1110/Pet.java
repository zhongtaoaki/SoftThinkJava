package demo.demo1110;

public class Pet {

	public String name ="pet";
	public int age;
	private String gender;
    private String sound;
    
    public String getSound() {
		return this.sound;
	}

	public void makeSound() {
		System.out.println(name + "が声している：" + sound);
	}
}
