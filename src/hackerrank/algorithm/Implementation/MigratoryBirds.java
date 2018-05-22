package hackerrank.algorithm.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {

	static int migratoryBirds(Map<Integer, Integer> map) {

		int largest = Integer.MIN_VALUE;
		int val = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > largest) {
				largest = entry.getValue();
				val = entry.getKey();
			} else if (entry.getValue() == largest) {
				if (entry.getKey() < val)
					val = entry.getKey();
			}
		}
		return val;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for (int ar_i = 0; ar_i < n; ar_i++) {
			int num = in.nextInt();
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}
		int result = migratoryBirds(map);
		System.out.println(result);
		in.close();
	}

}
