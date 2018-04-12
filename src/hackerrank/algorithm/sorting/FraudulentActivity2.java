package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class FraudulentActivity2 {

	static int activityNotifications(int[] expenditure, int d) {
		int notificationCount = 0;
		boolean isEven = (d % 2 == 0) ? true : false;
		insertionSort2(expenditure.length, expenditure);
		for (int i = d; i < expenditure.length; i++) {
			double median = getMedian(expenditure, d, isEven);
			if (expenditure[i] >= (2 * median))
				notificationCount++;
		}
		return notificationCount;
	}

	static double getMedian(int[] expenditure, int d, boolean isEven) {

		int[] a = new int[0];
		if (a.length==0) {
			a = new int[d];
			for (int i = 0; i < d; i++)
				a[i] = expenditure[i];
			insertionSort2(a.length, a);
		} else {
			for (int i = 1; i < a.length; i++)
				a[i - 1] = a[i];
			a[a.length - 1] = expenditure[d];
			insertionSort2(a.length, a);
		}
		if (!isEven) {
			return (a[((a.length - 1) / 2)]);
		} else {
			return (a[(a.length - 1) / 2] + a[(a.length + 1) / 2]) / 2.0;
		}

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
