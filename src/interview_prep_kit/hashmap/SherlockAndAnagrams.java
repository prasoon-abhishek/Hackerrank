package interview_prep_kit.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndAnagrams {
	// cdcd
	static int sherlockAndAnagrams(String s) {
		int count = 0;
		Map<Integer, ArrayList<String>> mMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			StringBuilder builder = new StringBuilder("");
			for (int j = i; j < s.length(); j++) {
				builder.append(s.charAt(j));
				if (mMap.get(builder.length()) == null) {
					ArrayList<String> strList = new ArrayList<>();
					char[] cArray = builder.toString().toCharArray();
					Arrays.sort(cArray);
					strList.add(new String(cArray));
					mMap.put(builder.length(), strList);
				} else {
					ArrayList<String> strList = mMap.get(builder.length());
					char[] cArray = builder.toString().toCharArray();
					Arrays.sort(cArray);
					strList.add(new String(cArray));
					mMap.put(builder.length(), strList);
				}

				// System.out.println(builder);

			}
		}
//		System.out.println(mMap);
		for (Integer key : mMap.keySet()) {
			ArrayList<String> mList = mMap.get(key);
			for (int i = 0; i < mList.size(); i++) {
				for (int j = i + 1; j < mList.size(); j++) {
					if (mList.get(i).equals(mList.get(j))) {
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String s = scan.next();
			System.out.println(sherlockAndAnagrams(s));
		}
	}
}
