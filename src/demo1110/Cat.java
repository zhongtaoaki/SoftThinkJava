package demo1110;

public class Cat extends Pet {

	public String name;
	private String gender;
	public String sound;
	public String color;

	public void makeSound() {
		System.out.println(name + "が声している：" + sound);
	}

}
