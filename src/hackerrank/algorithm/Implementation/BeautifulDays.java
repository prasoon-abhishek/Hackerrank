package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class BeautifulDays {

	static int beautifulDays(int i, int j, int k) {
		// Complete this function
		int beautyDays = 0;
		for (int n = i; n <= j; n++) {
			int in = reverseNum(n);
			int m = Math.abs(n - in);
			if (m % k == 0)
				beautyDays++;

		}
		return beautyDays;
	}

	static int reverseNum(int a) {
		int reversed = 0;
		while (a != 0) {
			int num = a / 10;
			int rem = a % 10;
			reversed = reversed * 10 + rem;
			a = num;
		}
		return reversed;
	}

	public static void main(String[] args) {
		System.out.println("enter i j k");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int result = beautifulDays(i, j, k);
		System.out.println(result);
		in.close();
	}

}
