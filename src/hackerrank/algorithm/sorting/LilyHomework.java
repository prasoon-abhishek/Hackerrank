package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class LilyHomework {

	static int lilysHomework(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int smallest = arr[i];
			int index = i;
			boolean isSmaller = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < smallest) {
					smallest = arr[j];
					index = j;
					isSmaller = true;
				}
			}
			if (isSmaller) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				count++;
				printArray(arr);
			}
		}
		return count;
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
		int result = lilysHomework(arr);
		System.out.println(result);
		in.close();
	}
}
