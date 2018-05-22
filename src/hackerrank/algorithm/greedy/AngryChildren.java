package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class AngryChildren {

	static int angryChildren(int k, int[] arr) {
		Arrays.sort(arr);
//		printArray(arr);
		k-=1;
		int minDifference = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length-k; i++) {
			System.out.println(arr[i + k] + "    " + arr[i]);
			int difference = arr[i + k] - arr[i];
			if (difference < minDifference)
				minDifference = difference;
		}
		return minDifference;

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
		int result = angryChildren(k, arr);
		System.out.println(result);
		in.close();
	}

}
