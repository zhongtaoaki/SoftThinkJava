package demo.demo1215;

public class ExceptionTest {

	public static void main(String[] args) {

		int arrayInt[] = {1,2,3};
		try {
			getElement(arrayInt, 5);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int getElement(int[] arrayInt, int index) throws Exception {

		if (arrayInt == null) {
			throw new NullPointerException("ここはヌール例外です");
		}
		if (index < 0 || index > arrayInt.length) {
			throw new IndexOutOfBoundsException("ここはインデックス例外です：" + index);
		}
		return arrayInt[index];

	}

}
