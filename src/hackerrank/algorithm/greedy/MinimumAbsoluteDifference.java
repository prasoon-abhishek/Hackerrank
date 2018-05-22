package hackerrank.algorithm.greedy;

import java.util.Scanner;

public class MinimumAbsoluteDifference {

	static int minimumAbsoluteDifference(int n, int[] arr) {
		int smallestDifference = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			int difference = arr[i] - arr[i - 1];
			if (difference < smallestDifference)
				smallestDifference = difference;
		}
		return smallestDifference;
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
		
		
		  int result = minimumAbsoluteDifference(n, arr);
		  System.out.println(result);
		 
		in.close();
	}
}
