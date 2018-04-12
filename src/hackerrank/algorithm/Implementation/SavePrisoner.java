package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class SavePrisoner {

	static int saveThePrisoner(int n, int m, int s) {
		// Complete this function
		int pos = s - 1;
		int rem = (pos + m) % n;
		if(rem==0)
			rem=n;
		
		return rem;
	}

	public static void main(String[] args) {
		System.out.println("enter no. of test cases");
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			System.out.println("enter n");
			int n = in.nextInt();
			System.out.println("enter m");
			int m = in.nextInt();
			System.out.println("enter s");
			int s = in.nextInt();
			int result = saveThePrisoner(n, m, s);
			System.out.println(result);
		}
	}
}
