package interview_prep_kit.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyQueries {

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Map<Integer, Integer> mMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
//			System.out.println(mMap);
			int q = scan.nextInt();
			int value = scan.nextInt();
			if (q == 1) {
				if (mMap.get(value) == null) {
					mMap.put(value, 1);
				} else {
					mMap.put(value, mMap.get(value) + 1);
				}
			} else if (q == 2) {
				if (mMap.get(value) != null) {
					if (mMap.get(value) == 1)
						mMap.remove(value);
					else {
						mMap.put(value, mMap.get(value) - 1);
					}
				}
			} else if (q == 3) {
				int freq=0;
				for (Integer key : mMap.keySet()) {
					if (mMap.get(key) == value) {
						freq=1;
						break;
					}
				}
				System.out.println(freq);
			}
		}
	}

}
