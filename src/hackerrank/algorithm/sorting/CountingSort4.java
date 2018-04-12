package hackerrank.algorithm.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSort4 {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, StringBuilder> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			StringBuilder s = new StringBuilder(in.next());
			if (i < (n/2))
				s = new StringBuilder("-");
			if (map.get(x) == null)
				map.put(x, s.append(" "));
			else
				map.put(x, map.get(x).append(s + " "));

		}
		for (Integer key : map.keySet()) {
			System.out.print(map.get(key));
		}

		in.close();
	}

}
