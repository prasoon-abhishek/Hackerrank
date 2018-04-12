package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class FindTheMedian {
	
	static int findMedian(int[] arr) {
		int result = arr.length / 2;
		return arr[result];
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
		int result = arr[(n-1)/2];
		System.out.println(result);
		in.close();
	}

}
