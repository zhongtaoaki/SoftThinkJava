package demo.demo0105;

class ClassSample {
	private Object o;

	public ClassSample(Object o) {
		this.o = o;
	}

	public Object getO() {
		return o;
	}
}

public class Main {

	public static void main(String[] args) {

		ClassSample cs = new ClassSample("Hello");
		Integer i = (Integer) cs.getO();
		System.out.println(i);
	}

}
