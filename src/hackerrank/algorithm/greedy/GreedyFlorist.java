package hackerrank.algorithm.greedy;

import java.util.Scanner;

public class GreedyFlorist {

	static int getMinimumCost(int n, int k, int[] c) {
		int[] d = decreasingOrder(c);

		int price = 0;
		int count = 1;
		int m = 0;

		while (m < d.length) {
			for (int j = 0; j < k; j++) {
				if (m < d.length) {
					// System.out.println("price " + price);
					price += d[m++] * count;
				}
			}
			count++;
		}

		return price;

	}

	static int[] decreasingOrder(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int largest = a[i];
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > largest) {
					largest = a[j];
					index = j;
				}
			}
			a[index] = a[i];
			a[i] = largest;

		}
		printArray(a);
		return a;
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
		int[] c = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		 int minimumCost = getMinimumCost(n, k, c);
		 System.out.println(minimumCost);
	}
}
