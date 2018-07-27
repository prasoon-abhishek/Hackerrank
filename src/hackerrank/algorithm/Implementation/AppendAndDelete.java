package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class AppendAndDelete {

	static String appendAndDelete(String s, String t, int k) {
		int commonCount = 0;
		int len = (s.length() < t.length()) ? s.length() : t.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == t.charAt(i)) {
				commonCount++;
			} else {
				break;
			}
		}
		System.out.println("commonCount " + commonCount);
		int remains = s.length() - commonCount + t.length() - commonCount;
		if (remains == k || (k > remains && remains % 2 == k % 2))
			return "Yes";
		else if (s.length() + t.length() <= k)
			return "Yes";

		return "No";
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		int k = scan.nextInt();

		String result = appendAndDelete(s, t, k);
		System.out.println(result);
	}
}
