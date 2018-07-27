package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPermutation {

	static int[] largestPermutation(int k, int[] arr) {

		int n = 0;

		for (int i = 0; i < k; i++) {
			int pivotIndex = n;

			int largest = arr[pivotIndex];
			int largestIndex = pivotIndex;
			for (int j = n + 1; j < arr.length; j++) {
				if (arr[j] > largest) {
					largest = arr[j];
					largestIndex = j;
				}
			}
			n++;
			if (largest == arr[pivotIndex])
				k++;
			int temp = largest;
			arr[largestIndex] = arr[pivotIndex];
			arr[pivotIndex] = largest;

		}
		return arr;
	}

	static void printArray(int[] arr) {
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int[] result = largestPermutation(k, arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
