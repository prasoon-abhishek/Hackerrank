package hackerank.algorithm.search;

import java.util.Scanner;

public class SherlockAndArray {

	static String solve(int[] a, long sum) {
		long leftSum = 0;
		long rightSum = 0;
		if (a.length > 1) {
			for (int i = 1; i < a.length; i++) {
				leftSum += a[i - 1];
				// System.out.println("leftSum "+leftSum);
				rightSum = sum - leftSum - a[i];
				// System.out.println("rightSum "+rightSum);
				if (leftSum == rightSum)
					return "YES";
			}
		} else {
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			long sum = 0;
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
				sum += a[a_i];
			}
			String result = solve(a, sum);
			System.out.println(result);
		}
		in.close();
	}
}
