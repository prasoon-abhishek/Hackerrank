package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class DrawingBook {

	static int solve(int n, int p) {
		if (n % 2 != 0) {
			n = n - 1;
		}

		if (n - p <= 1 && p % 2 == 0)
			return 0;
		else {
			int minPages = 0;

			int even = n;
			int odd = 1;
			if (n / 2 > p || n / 2 == p) {
				while (odd < p) {
					odd = odd + 2;
					minPages++;
				}

			} else {
				even = n;
				while (even > p) {
					even = even - 2;
					minPages++;
				}
			}

			return minPages;
		}
	}

	public static void main(String[] args) {
		System.out.println("enter total no. of pages");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("enter the page to be found");
		int p = in.nextInt();
		int result = solve(n, p);
		System.out.println(result);
	}

}
