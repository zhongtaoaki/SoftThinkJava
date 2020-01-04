package demo.demo1110;

public class HelloWorld {

	public static void main(String ars[]) {

		int a;
		int b;
		a = 1;
		b = 2;
		int c = a + b;
		System.out.println(c);

		int d = 1;
		int e = 2;
		System.out.println(d + e);

		String str = "Hello World";
		System.out.println(str);

		if (d==c) {
			System.out.println("正しい");
		}else {
			System.out.println("×");
		}
		
		
//		for (;i < 10; i++) {
//			System.out.println(i+str);
//		}
		
//		while (i<10) {
//			i++;
//			System.out.println(i+str);	
//			
//		}
		
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.loop());
		

	}
	
	 String loop() {
		int i =0;
		do {
			i++;
			System.out.println(i);				
		} while ( i<10);
		return "hello";
	}
	
	
}
