package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class FindDigits {

	static int findDigits(int n) {
		// Complete this function
		int count = 0;
		String num = String.valueOf(n);
		for (int i = 0; i < num.length(); i++) {
			try {
				int divisor = Integer.valueOf(num.substring(i, i + 1));
				if (n % divisor == 0)
					count++;
			} catch (Exception e) {
//				System.out.println(e);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers");
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			System.out.println("eneter num");
			int n = in.nextInt();
			int result = findDigits(n);
			System.out.println(result);
		}
		in.close();
	}

}
