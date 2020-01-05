package demo.demo0105;

public class Outer {
	private static int outerValue;

	public static class Inner {
		public int innerValue;

		private void method() {
			// OK
			// this.innerValue = Outer.this.outerValue;
		}
	}

	private void method() {
		int outerValue;
		class InnerLocal {
			public int innerValue;

			private void method() {
				// OK
				//this.innerValue = Outer.this.outerValue;
			}
		}
		InnerLocal local = new InnerLocal();
		// NG
		 //this.outerValue = innerValue ;
		//Outer outer = new Outer();
		int i = Outer.outerValue;
		//Outer.Inner inner = outer.new Inner();
		Outer.Inner inner =new Outer.Inner();	
	}
}
	

