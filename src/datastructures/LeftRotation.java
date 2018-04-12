package datastructures;

import java.util.Scanner;

public class LeftRotation {

	static int[] leftRotation(int[] a, int d) {
		
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n = in.nextInt();
		System.out.println("enter number of left rotations:");
		int d = in.nextInt();
		int[] a = new int[n];
		System.out.println("enter " + n + " elements:");
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
