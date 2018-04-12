package hackerrank_algorithms;

import java.util.Scanner;

public class BonAppetit {
	// n=number of items ordered
	// k=index of item Anna didn't ate
	static void check(int n, int k, int[] itemsPrice, int amountCharged) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + itemsPrice[i];
		}
		sum = sum - itemsPrice[k];
		int actualCost = sum / 2;
		if (actualCost == amountCharged)
			System.out.println("Bon Appetit");
		else
			System.out.println(amountCharged - actualCost);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter n and k");
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] itemsPrice = new int[n];
		System.out.println("enter " + n + " items price:");
		for (int i = 0; i < n; i++) {
			itemsPrice[i] = scan.nextInt();
		}

		System.out.println("enter amount charged:");
		int amountCharged = scan.nextInt();

		check(n, k, itemsPrice, amountCharged);
		scan.close();
	}

}
