package hackerrank.datastructures.arrays;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n m");
		int n = in.nextInt();
		int m = in.nextInt();
		int[] mArray = new int[n];
		// for (int i = 0; i < n; i++) {
		// mArray[i] = 0;
		// }
		for (int a0 = 0; a0 < m; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			for (int i = a - 1; i <= b - 1; i++) {
				mArray[i] += k;

			}
		}
		long largest = 0;
		for (int i = 0; i < n; i++) {
			if (mArray[i] > largest)
				largest = mArray[i];
		}

		System.out.println(largest);
		in.close();
	}

}
