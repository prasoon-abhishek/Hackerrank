package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class FairRations {

	// static void fairRations(int[] B) {
	// // Complete this function
	// int count = 0;
	// for (int i = 0; i < B.length - 2; i++) {
	// if (B[i] % 2 != 0 && B[i + 1] % 2 == 0 && B[i + 2] % 2 != 0)
	// count += 2;
	// }
	// String result = count != 0 ? String.valueOf(count) : "NO";
	// System.out.println(result);
	// }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int N = in.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			sum += in.nextInt();
			System.out.println("sum " + sum);
			if (sum % 2 == 1)
				count += 2;
		}

		System.out.println(sum % 2 == 0 ? count : "NO");
		in.close();
	}
}
