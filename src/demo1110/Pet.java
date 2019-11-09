package demo1110;

public class Pet {

	public String name;
	public int age;
	private String gender;
	private String sound;

	public void makeSound() {
		System.out.println(name + "が声している：" + sound);
	}
}
