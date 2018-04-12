package hackerrank.algorithm.sorting;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FraudulentActivity {

	static int activityNotifications(int[] expenditure, int d) {
		int notificationCount = 0;
		int idx = 0;
		for (int i = d; i < expenditure.length; i++) {
			double median = getMedian(expenditure, idx++, i);
			if (expenditure[i] >= (2 * median))
				notificationCount++;
		}
		return notificationCount;
	}

	
	static double getMedian(int[] arr, int startIdx, int endIdx) {
		int len = endIdx - startIdx;
		int[] a = new int[len];
		int index = 0;
		for (int i = startIdx; i < endIdx; i++) {
			a[index++] = arr[i];
		}
		insertionSort2(a.length, a);
		printArray(a);
		boolean isEven = (len % 2 == 0) ? true : false;
		if (!isEven) {
			return (a[ ((len - 1) / 2)]);
		} else {
			return (a[(len - 1) / 2] + a[(len + 1) / 2]) / 2.0;
		}
	}


	static void printArray(int[] arr) {
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
		System.out.println();
	}

	static void insertionSort2(int n, int[] arr) {

		for (int i = 1; i < n; i++) {
			int j = i;

			while (j > 0 && arr[j] < arr[j - 1]) {
				int key = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = key;
				j--;
			}

		}
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] expenditure = new int[n];
		
		 for (int expenditure_i = 0; expenditure_i < n; expenditure_i++) {
		 expenditure[expenditure_i] = in.nextInt();
		 }

		int result = activityNotifications(expenditure, d);
		System.out.println(result);

		in.close();
	}

}
