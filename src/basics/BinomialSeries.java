package basics;

import java.util.Scanner;

public class BinomialSeries {

	public static void main(String[] args) {

		int a = 0, b = 0, n = 0;
		System.out.println("enter values: ");
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			n = in.nextInt();
		}
		for (int i = 0; i < t; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum = a;
				for (int k = 0; k <= j; k++) {
					sum += Math.pow(2, k) * b;
				}
				System.out.print(sum + " ");
			}
		}

	}

}
