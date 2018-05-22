package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class CircularArrayRotation {
//	static int[] circularArrayRotation(int[] a, int[] m) {
//		printArray(a);
//		return a;
//	}
//
//	static void printArray(int[] arr) {
//		for (int j = 0; j < arr.length; j++)
//			System.out.print(arr[j] + " ");
//		System.out.println();
//	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			if (i + k < n)
				a[i + k] = in.nextInt();
			else
				a[(i + k) % n] = in.nextInt();

		}
		int[] m = new int[q];
		for (int m_i = 0; m_i < q; m_i++) {
			m[m_i] = in.nextInt();
			System.out.println(a[m[m_i]]);
		}
//		int[] result = circularArrayRotation(a, m);
//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
//		}
//		System.out.println("");

		in.close();
	}
}
