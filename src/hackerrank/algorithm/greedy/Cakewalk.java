package hackerrank.algorithm.greedy;

import java.util.Scanner;

public class Cakewalk {

	static long marcsCakewalk(int[] calorie) {
		long walk = 0;
		for (int i = 0; i < calorie.length; i++) {
			walk += calorie[i] * Math.pow(2, i);
		}
		return walk;
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
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			int j = i;

			while (j > 0 && arr[j] > arr[j - 1]) {
				int key = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = key;
				j--;
			}
		}

//		printArray(arr);
		long result = marcsCakewalk(arr);
		System.out.println(result);
		in.close();
	}
}
