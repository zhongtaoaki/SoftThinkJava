package demo.demo0112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 2, 3, 1, 7, 8, 1, 2, 5, 6 };

		sort(arr, 0, arr.length - 1);

	}

	// bubble sort
	public static int[] bubbleSort(int[] arr) {
		for (int j = 1; j < arr.length - 2; j++) {

			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					// swap
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static List<Integer> bucketSort(int[] arr) {

		if (arr.length == 0) {
			System.out.println("からだから、これソートできない");
			return null;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				// swap
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		int max = arr[arr.length - 1];

		int[] count = new int[max + 1];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < count.length; i++) {
			int countInt = count[i];
			while (countInt > 0) {
				list.add(i);
				countInt--;
			}
		}

		return list;

	}

	public static void sort(int[] arr, int begin, int end) {

		if (begin >= end) {
			return;
		}
		int key = arr[begin];
		int b = begin;
		int e = end;

		while (b < e) {
			while (b < e) {
				if (arr[e] >= key) {
					e--;
				} else {
					arr[b] = arr[e];
					b++;
					break;
				}
			}

			while (b < e && arr[b] <= key) {
				b++;
			}
			if (key < arr[b]) {
				arr[e] = arr[b];
				e--;
			}

			for (int i : arr) {
				System.out.print(i);
			}
			System.out.println("\n");
		}

		arr[b] = key;

		sort(arr, begin, b - 1);
		sort(arr, b + 1, end);

	}

}
