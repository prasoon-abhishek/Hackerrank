package cracking_the_coding_interview;

import java.util.Scanner;

public class LeftRotation {

	static int[] leftRotate(int[] a, int k) {
		int n = a.length;
		k = k % n;
		int[] arr = new int[n];
		// System.out.println("k " + k);
		for (int i = n - 1; i >= 0; i--) {
			int index = i - k;

			if (index >= 0) {
				// System.out.println("index="+index+" i="+i);
				arr[index] = a[i];
			} else {
				index = index + n;
				// System.out.println("index="+index+" i="+i);
				arr[index] = a[i];
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		k = k % n;
		int a[] = new int[n];
		for (int i = 0; i <n; i++) {
			int num = in.nextInt();
			int index = i - k;

			if (index >= 0) {
				a[index] = num;
			} else {
				index = index + n;
				a[index] = num;
			}

		}
		 for (int i = 0; i < n; i++)
		 System.out.print(a[i] + " ");
	}
}
