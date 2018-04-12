package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class AngryProfessor {

	static String angryProfessor(int k, int[] a) {
		// Complete this function
		int studentPresent = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0)
				studentPresent++;
		}
		return studentPresent > k ? "NO" : "YES";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter t");
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			System.out.println("enter n");
			int n = in.nextInt();
			System.out.println("enter k");
			int k = in.nextInt();
			System.out.println("enter n numbers");
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			String result = angryProfessor(k, a);
			System.out.println(result);
		}
		in.close();
	}
}
