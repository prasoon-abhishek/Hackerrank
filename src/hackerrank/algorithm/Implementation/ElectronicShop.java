package hackerrank.algorithm.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElectronicShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int s) {
		// Complete this function
		int price = -1;
		int newPrice = 0;

		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				newPrice = keyboards[i] + drives[j];
				if (newPrice > price && newPrice <= s) {
					price = newPrice;
				}
			}
		}
		return price;

	}

	static Map<String, String> finalObj = new HashMap<String, String>();

	public static void main(String[] args) {
		System.out.println("enter s , n ,m");
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] keyboards = new int[n];
		System.out.println("enter " + n + " elments");
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();

		}
		int[] drives = new int[m];
		System.out.println("enter " + m + " elements");
		for (int drives_i = 0; drives_i < m; drives_i++) {
			drives[drives_i] = in.nextInt();
		}
		// The maximum amount of money she can spend on a keyboard and USB
		// drive, or -1 if she can't purchase both items
		int moneySpent = getMoneySpent(keyboards, drives, s);
		System.out.println(moneySpent);
		in.close();
	}

}
