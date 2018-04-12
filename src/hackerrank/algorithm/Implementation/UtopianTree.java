package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class UtopianTree {

	static int utopianTree(int n) {
		// Complete this function

		int finalHeight = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				finalHeight = (finalHeight * 2);
				// System.out.println("finalHeight" + finalHeight);
			} else if (i % 2 == 0) {
				finalHeight = finalHeight + 1;
				// System.out.println("finalHeight" + finalHeight);
			}
		}

		return finalHeight;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter t");
		int t = in.nextInt();
		System.out.println("enter " + t + " numbers");
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int result = utopianTree(n);
			System.out.println(result);
		}
		in.close();
	}
}
