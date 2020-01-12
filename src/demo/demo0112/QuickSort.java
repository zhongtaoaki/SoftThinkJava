package demo.demo0112;

public class QuickSort {

	private static void sort(int[] src, int begin, int end) {
		if (begin < end) {
			int key = src[begin];
			int i = begin;
			int j = end;
			while (i < j) {
				while (i < j && key < src[j]) {
					j--;
				}
				src[i] = src[j];
				i++;
				while (i < j && src[i] < key) {
					i++;
				}
				src[j] = src[i];
				j--;
			}
			src[i] = key;
			sort(src, begin, i - 1);
			sort(src, i + 1, end);
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 6, 2, 3, 1, 7, 8, 1, 2, 5, 6 };
		sort(array, 0, array.length - 1);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
