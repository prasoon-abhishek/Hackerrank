package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class RepeatedString {

	static long repeatedString(String s, long n) {
		// Complete this function
		int aCount = 0;
		long totalaCount = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a') {
				aCount++;
			}
		}
		long quo = n / s.length();
		totalaCount = aCount * quo;
		long rem = n % s.length();

		if (rem != 0) {
			long remCount = 0;
			for (char c : s.toCharArray()) {
				if (c == 'a')
					remCount++;
			}
			totalaCount += remCount;
		}
		return totalaCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter s");
		String s = in.next();
		System.out.println("Enter n");
		long n = in.nextLong();
		long result = repeatedString(s, n);
		System.out.println(result);
		in.close();
	}

}
