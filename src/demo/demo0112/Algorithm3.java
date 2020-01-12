package demo.demo0112;

import java.util.HashSet;
import java.util.Set;

public class Algorithm3 {

	public static void main(String[] args) {

		int[] array = { 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1 };
		int sumArray = 0;
		Set<Integer> set = new HashSet<>();
		for (int i : array) {
			set.add(i);
			sumArray += i;
		}
		
		int sumSet = 0;
		for (Integer i : set) {
			sumSet += i;
		}

		System.out.println(sumSet * 2 - sumArray);

		//
	}
}
