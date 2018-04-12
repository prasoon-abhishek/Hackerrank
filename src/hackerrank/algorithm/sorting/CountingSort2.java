package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class CountingSort2 {

	static int[] countingSort(int[] arr) {
		int[] countArray = new int[100];
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			countArray[n]++;
		}
		int[] result = new int[arr.length];
		int k = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < countArray[i]; j++) {
				result[k++] = i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int[] result = countingSort(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
