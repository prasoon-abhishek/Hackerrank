package hackerrank.algorithm.greedy;

import java.util.Scanner;

public class SherlockAndBeast {

	public static String combine(StringBuilder builder) {
		int fiveCount = builder.length();
		int threeCount = 0;
		if (fiveCount % 3 != 0) {
			for (int i = builder.length(); i > 0; i = i - 5) {
				if (fiveCount >= 5) {
					builder.replace(i - 5, i, "33333");
					fiveCount -= 5;
					threeCount += 5;
					if (fiveCount % 3 == 0) {
						break;
					}
				}
			}
		}
		if (fiveCount % 3 == 0 && threeCount % 5 == 0)
			return builder.toString();
		else
			return "-1";
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int a0 = 0; a0 < t; a0++) {
			StringBuilder builder = new StringBuilder("");
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				builder.append("5");
			}

			String result = combine(builder);
			System.out.println(result);
		}

	}

}
