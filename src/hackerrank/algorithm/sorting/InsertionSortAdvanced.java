package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class InsertionSortAdvanced {

	static int insertionSort(int[] arr) {
		int shiftCount = 0;
		for (int i = 1; i < arr.length; i++) {
			int j = i;

			while (j > 0 && arr[j] < arr[j - 1]) {
				int key = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = key;
				j--;
				shiftCount++;
			}
		}
		return shiftCount;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int shiftCount=0;
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
					shiftCount++;
				}
			}
//			int result = insertionSort(arr);
			System.out.println(shiftCount);
		}
		in.close();
	}

}
