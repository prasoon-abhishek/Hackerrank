package hackerrank.algorithm.Implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NonDivisibleSubset {

	static int nonDivisibleSubset(int k, Map<Integer, Integer> map) {
		System.out.println(map);
		Set<Integer> mSet = new HashSet<>(map.keySet());
		System.out.println(mSet);
		int count = 0;
		for (Integer key : map.keySet()) {
			// int key=i.getKey();
			if (key == 0 || key == k - key) {
				count++;
				mSet.remove(key);
			} else if (mSet.contains(key) && mSet.contains(k - key)) {
				if (map.get(key) > map.get(k - key))
					count += map.get(key);
				else
					count += map.get(k - key);
				mSet.remove(key);
				mSet.remove(k - key);
			} else if (mSet.contains(key)) {
				count += map.get(key);
				mSet.remove(key);
			}

			System.out.println(mSet);
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		// int[] arr = new int[n];
		Map<Integer, Integer> mMap = new HashMap<>();
		for (int arr_i = 0; arr_i < n; arr_i++) {
			int num = in.nextInt();
			int module = num % k;
			if (!mMap.containsKey(module))
				mMap.put((module), 1);
			else
				mMap.put(module, mMap.get(module) + 1);
		}
		int result = nonDivisibleSubset(k, mMap);
		System.out.println(result);
		in.close();
	}
}
