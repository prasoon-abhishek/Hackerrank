package hackerrank.algorithm.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumDistances {
	static int minimumDistances(int[] a) {
		// Complete this function
		int min = 100000000;
		Map<Integer, Integer> mMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (mMap.containsKey(a[i])) {
				int nMin = Math.abs(i - mMap.get(a[i]));
				if (nMin < min)
					min = nMin;
			}
			mMap.put(a[i], i);
		}
		if (min == 100000000)
			min = -1;
		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter n");
		int n = in.nextInt();
		System.out.println("enter " + n + " numbers");
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int result = minimumDistances(a);
		System.out.println(result);
		in.close();
	}
}
