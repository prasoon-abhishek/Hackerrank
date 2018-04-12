package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class InsertionSort1 {

	static void insertionSort1(int n, int[] arr) {
		int key = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {

			if (i > 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				printArray(arr);
			} else {

				arr[i + 1] = key;
				if (i == 0 && arr[i] > key) {
					arr[i + 1] = arr[i];
					printArray(arr);
					arr[i] = key;
				}
				printArray(arr);
				break;
			}
		}

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
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		insertionSort1(n, arr);
		in.close();
	}

}
