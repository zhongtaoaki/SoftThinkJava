package demo.demo0105;

public class Outer {
	private int outerValue;

	public class Inner {
		public int innerValue;

		private void method() {
			// OK
			this.innerValue = Outer.this.outerValue;
		}
	}

	private void method() {
		// NG
		// this.outerValue = innerValue ;
		Outer.Inner inner = (new Outer()).new Inner();
	}
}
