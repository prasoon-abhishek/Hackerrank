package hackerrank.algorithm.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeautifulPairs {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		Map<Integer, Integer> mapA = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (mapA.get(num) != null)
				mapA.put(num, mapA.get(num) + 1);
			else
				mapA.put(num, 1);
		}
		System.out.println(mapA);
		// Map<Integer, Integer> mapB = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (mapA.get(num) != null && mapA.get(num) > 0) {
				mapA.put(num, mapA.get(num) - 1);
				count++;
			}
		}
		if (count < n)
			count++;
		else
			count--;
		System.out.println(count);
	}
}
