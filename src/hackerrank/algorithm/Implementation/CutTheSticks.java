package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class CutTheSticks {

	static void cutTheSticks(int[] arr, int smallest) {
		// Complete this function
		int complete = 0;
		System.out.println(arr.length);
		while (complete != arr.length) {
			int count = 0;
			complete = 0;
			int mSmallest = 1001;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] - smallest;
				if (arr[i] > 0) {
					count++;
				} else {
					complete++;
				}
				if (arr[i] > 0 && arr[i] < mSmallest) {
					mSmallest = arr[i];
				}

			}
			if (count > 0)
				System.out.println(count);
			smallest = mSmallest;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter num of elements in array");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("enter " + n + " numbers");
		int smallest = 1001;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (arr[arr_i] < smallest)
				smallest = arr[arr_i];
		}
		cutTheSticks(arr, smallest);

		in.close();
	}
}
