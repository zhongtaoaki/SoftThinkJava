package demo.demo0105;

import java.util.ArrayList;
import java.util.List;

public class StreamApiDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(6);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
//		list.stream().map(i -> {
//			return i * i;
//		}).filter(i -> {
//			return i > 25;
//		}).forEach(i -> {
//			System.out.println(i);
//		});

		list = sort(list);
		list.stream().forEach(System.out::println);
	}

	private static List<Integer> sort(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			int changeIndex = i;
			int minElement = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				int compareElement = list.get(j);
				if (compareElement < minElement) {
					minElement = compareElement;
					changeIndex = j;
				}
			}
			if (i != changeIndex) {
				list.set(changeIndex, list.get(i));
				list.set(i, minElement);
			}
		}
		return list;
	}

}
