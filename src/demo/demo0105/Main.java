package demo.demo0105;

import java.util.List;

class ClassSample<T> {
	private T o;

	public ClassSample(T o) {
		this.o = o;
	}

	public T getO() {
		return o;
	}
}

public class Main {

	public static void main(String[] args) {

		ClassSample<String> cs = new ClassSample<String>("Hello");
		//Integer i = (Integer) cs.getO();
		System.out.println(cs);
	}

}
