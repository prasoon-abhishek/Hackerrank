package hackerank.algorithm.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbers {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (!map.containsKey(num))
				map.put(num, 1);
			else
				map.put(num, map.get(num) + 1);
		}
		// System.out.println(map);
		int m = in.nextInt();

		for (int brr_i = 0; brr_i < m; brr_i++) {
			int num = in.nextInt();
			if (!map.containsKey(num))
				map.put(num, m+1);
			// System.out.println("here");
			else {
				map.put(num, map.get(num) - 1);
				// System.out.println(map);
				if (map.get(num) == 0) {
					// System.out.println(num);
					map.remove(num);
				}
			}
		}
		 System.out.println(map.get(3685));

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		for (Integer i : keys) {
			System.out.print(i+" ");
		}
		in.close();
	}
}
