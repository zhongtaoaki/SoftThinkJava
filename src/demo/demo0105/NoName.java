package demo.demo0105;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface Person {
	public abstract void eat();
}

class Child implements Person {
	@Override
	public void eat() {
		System.out.println("eat something");
	}
	public void name() {
		
	}}

public class NoName {
	public static void main(String[] args) {
//		Person p = new Child();
//		p.eat();
//		Person person = new Person() {
//			public void eat() {
//				System.out.println("eat something");
//			}
//		};
//		person.eat();
		
//		Person person = () -> {
//			System.out.println("eat something");
//		};
//		person.eat();

		Function<Integer, String> asterisker = (i) -> {
			return "*" + i;
		};
		String result = asterisker.apply(10);
		System.out.println(result); // *10

		Consumer<String> buyer = (goods) -> {
			System.out.println(goods + "を購入しました");
		};
		buyer.accept("おにぎり");

		Predicate<String> checker = (s) -> {
			return s.equals("Java");
		};
		boolean result1 = checker.test("Java");
		System.out.println(result1);
	}
}
