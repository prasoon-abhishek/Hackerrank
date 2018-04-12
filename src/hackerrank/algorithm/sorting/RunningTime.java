package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class RunningTime {

	static int runningTime(int[] arr) {
		int shiftCount = 0;
		for (int i = 1; i < arr.length; i++) {
			int j = i;
//			System.out.println("i " + i);
			while (j > 0 && arr[j] < arr[j - 1]) {
				int key = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = key;
				j--;
//				printArray(arr);
				shiftCount++;
			}
		}
		return shiftCount;
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
		int result = runningTime(arr);
		System.out.println(result);
		in.close();
	}
}
