package huoYing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("aを入力して下さい。");
		int a = in.nextInt();
		System.out.println("bを入力してくさい。");
		int b = in.nextInt();
		System.out.println("aプラスb");

		System.out.println(a + b);

	}

}

class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ArrayList<String> list = null;

			list.get(0);

		} catch (NullPointerException e) {
			System.out.println("チンプンカンプン");

			// TODO: handle exception
		} finally {

		}

		try {
			List<String> list = new ArrayList<String>();
			String string = "aaaaa";
			list.add(string);
			list.add("233");
			list.add("k");
			String strIndex2 = list.get(2);

			System.out.println(strIndex2);
			System.out.println(list.size());

			list.clear();
			System.out.println(list.size());

			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(3, "111");
			map.put(1, "222");
			map.remove(3);
			System.out.println(map.get(1));

			list.get(3);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("超難しい");
			e.printStackTrace();
			System.out.println(e.getMessage());
			//

		}
	}
}
