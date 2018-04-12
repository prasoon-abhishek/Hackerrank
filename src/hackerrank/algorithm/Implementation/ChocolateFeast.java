package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class ChocolateFeast {

	static int chocolateFeast(int n, int c, int m) {
		// Complete this function
		int chocs = n / c;
		System.out.println(chocs);
		int wrappers = chocs;
		System.out.println(wrappers);
		while (wrappers >= m) {
			chocs += wrappers / m;
			System.out.println(chocs);
			wrappers = wrappers / m + wrappers % m;
			System.out.println(wrappers);
		}
		return chocs;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter t");
		int t = in.nextInt();

		for (int a0 = 0; a0 < t; a0++) {
			System.out.println("enter n c m");
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int result = chocolateFeast(n, c, m);
			System.out.println(result);
		}
		in.close();
	}

}
