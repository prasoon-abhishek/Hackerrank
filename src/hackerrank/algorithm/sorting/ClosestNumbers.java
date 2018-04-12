package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class ClosestNumbers {

	static void closestNumbers(int n, int[] a) {
		int smallest = a[1] - a[0];
		for (int i = 2; i < n; i++) {
			int mSmallest = a[i] - a[i - 1];
			if (mSmallest <= smallest) {
				smallest = mSmallest;
			}

		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] - a[i - 1] == smallest)
				System.out.print(a[i-1] + " " + a[i ] + " ");
		}

	}

	
	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			int j = i;

			while (j > 0 && arr[j] < arr[j - 1]) {
				int key = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = key;
				j--;
			}
		}
		/*
		 * int[] result = closestNumbers(n, arr); for (int i = 0; i <
		 * result.length; i++) { System.out.print(result[i] + (i !=
		 * result.length - 1 ? " " : "")); } System.out.println("");
		 */
		closestNumbers(n, arr);
		in.close();
	}

	

}
