package demo1215;

public class ExceptionDemo {

	public static void main(String[] args) {

		int arrayInt[] = {1,2,3};
		try {
			getElement(arrayInt, 5);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "例外です");
		} catch (RuntimeException e) {
			System.out.println(e + "runtime例外です");
		} finally {
			arrayInt = null;
		}
	}

	private static int getElement(int[] arrayInt, int index) throws RuntimeException {
		if (arrayInt == null) {
			throw new NullPointerException("配列はヌール");
		}
		if (index < 0 || index > arrayInt.length) {
			throw new ArrayIndexOutOfBoundsException("インデックスは間違った");
		}

		return arrayInt[index];

	}

}
