package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumToys {

	static long maximumToys(long[] prices, long k) {
		Arrays.sort(prices);
		long price = 0;
		long count = 0;
		for (int i = 0; i < prices.length; i++) {
			System.out.println(price);
			if (price + prices[i] > k)
				break;
			price += prices[i];
			count++;

		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = in.nextLong();
		long[] prices = new long[n];
		for (int prices_i = 0; prices_i < n; prices_i++) {
			prices[prices_i] = in.nextInt();
		}
		long result = maximumToys(prices, k);
		System.out.println(result);
		in.close();
	}
}
