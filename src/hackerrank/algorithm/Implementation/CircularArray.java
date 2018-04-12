package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class CircularArray {

	static int[] circularArrayRotation(int[] a, int k, int[] m) {
		// Complete this function
		// a=actual array
		// m=contains index to be printed after rotation
		// k=num of rotations
		int[] result = new int[a.length];
		for (int i = 0; i < k; i++) {
			int lastElement = a[a.length - 1];
			int prevElement = a[0];
			for (int j = 1; j < a.length; j++) {
				int currElement = a[j];
				a[j] = prevElement;
				prevElement = currElement;
			}
			a[0] = lastElement;
		}
		for (int i = 0; i < m.length; i++) {
			result[i] = a[m[i]];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter num of elements in array");
		int n = in.nextInt();
		System.out.println("enter num of rotations");
		int k = in.nextInt();
		System.out.println("enter the index of rotated array");
		int q = in.nextInt();
		int[] a = new int[n];
		System.out.println("enter " + n + " elements");
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		System.out.println("enter " + q + "elements");
		int[] m = new int[q];
		for (int m_i = 0; m_i < q; m_i++) {
			m[m_i] = in.nextInt();
		}
		int[] result = circularArrayRotation(a, k, m);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		in.close();
	}

}
