package hackerrank.algorithm.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStation {

	static int flatlandSpaceStations(int n, int[] c) {
		// Complete this function
		Arrays.sort(c);
		int largest = 0;
		for (int i = 0; i < c.length - 1; i++) {

			System.out.println(c[i] + " " + c[i + 1]);
			int difference = Math.abs((c[i] - c[i + 1])) / 2;
			System.out.println("difference " + difference);

			if (i == c.length - 2) {
				int fDiff = n - 1 - c[i + 1];
				System.out.println("fDiff " + fDiff);
				if (fDiff > difference)
					difference = fDiff;
			}
			if (i == 0) {
				int fDiff = c[i];
				if (fDiff > difference)
					difference = fDiff;
			}

			if (difference > largest)
				largest = difference;
		}
		if (c.length == 1)
			largest = n - 1 - c[0]>c[0]?n - 1 - c[0]:c[0];
		return largest;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] c = new int[m];
		for (int c_i = 0; c_i < m; c_i++) {
			c[c_i] = in.nextInt();
		}
		int result = flatlandSpaceStations(n, c);
		System.out.println(result);
		in.close();
	}

}
