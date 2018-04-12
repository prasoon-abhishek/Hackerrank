package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pivot = in.nextInt();
		StringBuffer buffer = new StringBuffer(pivot+" ");
		for (int arr_i = 1; arr_i < n; arr_i++) {
			int num = in.nextInt();
			if (num > pivot)
				buffer.append(num + " ");
			else
				System.out.print(num + " ");
		}
		System.out.println( buffer.toString());

		in.close();
	}
}
