package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {

	static String twoArrays(int k, int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);
//		printArray(A);
//		printArray(B);
		int i=0;
		String permutable="YES";
		while(i<A.length){
			if(A[i]+B[B.length-1-i]<k)
				permutable="NO";
			i++;
		}
		return permutable;
	}
	static void printArray(int[] arr) {
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
		System.out.println();
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

		return a;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] A = new int[n];
			for (int A_i = 0; A_i < n; A_i++) {
				A[A_i] = in.nextInt();
			}
			int[] B = new int[n];
			for (int B_i = 0; B_i < n; B_i++) {
				B[B_i] = in.nextInt();
			}
			String result = twoArrays(k, A, B);
			System.out.println(result);
		}
		in.close();
	}
}
