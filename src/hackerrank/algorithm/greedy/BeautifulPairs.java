package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeautifulPairs {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> mapA = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			int count = 0;
			if (mapA.containsKey(num)) {
				count = mapA.get(num);
				mapA.put(num, count + 1);
			} else {
				mapA.put(num, count + 1);
			}
		}
		System.out.println(mapA);
		int paircount = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (mapA.containsKey(num)) {
				int count = mapA.get(num);
				if (count > 0) {
					paircount++;
					mapA.put(num, count - 1);
				}
			}

		}

		if (paircount < n)
			paircount++;
		// else
		// paircount--;

		System.out.println(paircount);

	}
}
