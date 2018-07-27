package interview_prep_kit.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTriplets {

	static long countTriplets(int[] arr, int r) {
		long count = 0;
		Map<Integer, Integer> mMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (mMap.get(arr[i]) == null) {
				mMap.put(arr[i], 1);
			} else {
				mMap.put(arr[i], mMap.get(arr[i]) + 1);
			}
		}
		 System.out.println(mMap);

		for (Integer i : mMap.keySet()) {
			if (mMap.get(i / r) != null && mMap.get((i / r) / r) != null) {
				count += mMap.get(i) + mMap.get(i / r) + mMap.get((i / r) / r);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

		}
		System.out.println(countTriplets(arr, r));
	}
}
