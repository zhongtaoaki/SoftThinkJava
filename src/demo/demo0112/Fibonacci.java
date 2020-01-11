package demo.demo0112;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, …
public class Fibonacci {

	private static int fib(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		return fib(num - 1) + fib(num - 2);
	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		int n = 40;
		int sum = fib(n);

		long end = System.currentTimeMillis();
		System.out.println(n + " -> " + sum);
		System.out.println("time: " + (end - start));
	}

}
