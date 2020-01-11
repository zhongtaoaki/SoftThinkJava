package demo.demo0112;

//input: [6,6,5,5,4,4,3,3,2,2,1]
//output:[1]
public class Algorithm1 {

	public static void main(String[] args) {

		int[] array = { 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[i] = array[j] = -1;
				}
			}
		}
		for (int i : array) {
			if (i != -1) {
				System.out.println(i);
			}
		}

	}
}
