package hackerrank.algorithm.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HappyLadybugs {

	static String happyLadybugs(String b) {

		int spaceCount = 0;
		Map<Character, Integer> mMap = new HashMap<>();
		for (int i = 0; i < b.length(); i++) {
			Character c = b.charAt(i);
			if ((int) c == 95) {
				spaceCount++;
				continue;
			}

			if (mMap.get(c) == null)
				mMap.put(c, 1);
			else
				mMap.put(c, mMap.get(c) + 1);

		}

		Set<Character> mSet = mMap.keySet();
		if (spaceCount > 0) {
			for (Character c : mSet) {

				if (mMap.get(c) <= 1)
					return "NO";

			}

		} else {

			if (b.length() == 1 || (b.charAt(0) != b.charAt(1))
					|| (b.charAt(b.length() - 1) != b.charAt(b.length() - 2)))
				return "NO";

			for (int i = 1; i < b.length() - 1; i++) {
				if (b.charAt(i) != b.charAt(i - 1) && b.charAt(i) != b.charAt(i + 1))
					return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			scan.nextLine();
			String b = scan.nextLine();
			String result = happyLadybugs(b);
			System.out.println(result);
		}
	}
}
