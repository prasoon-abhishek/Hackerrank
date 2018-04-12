package hackerrank.datastructures.arrays;

import java.util.Scanner;

public class LeftRotation {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println();
		String[] nd = scan.nextLine().split(" ");

		int n = Integer.parseInt(nd[0].trim());

		int d = Integer.parseInt(nd[1].trim());

		int[] a = new int[n];

		String[] aItems = scan.nextLine().split(" ");

		for (int aItr = 0; aItr < n; aItr++) {
			int aItem = Integer.parseInt(aItems[aItr].trim());
			a[aItr] = aItem;
		}
		d = d % n;
		for (int i = d; i < n + d; i++) {
			if (i < n)
				System.out.print(aItems[i]+" ");
			else
				System.out.print(aItems[i - n]+" ");
		}
	}

}
