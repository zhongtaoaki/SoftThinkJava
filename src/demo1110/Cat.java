package demo1110;

public class Cat extends Pet{

	public String gender;
	public String color;
	public String name="cat";

	public void makeSound() {
		System.out.println(super.name + "が声している：" + getSound());
	}

}
