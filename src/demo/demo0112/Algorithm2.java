package demo.demo0112;

import java.util.HashMap;
import java.util.Map;

public class Algorithm2 {
	public static void main(String[] args) {

		int[] array = { 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.remove(i);
			}
		}
		for (Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}

	}
}
