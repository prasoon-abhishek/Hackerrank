package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class CavityMap {

	static void cavityMap(String grid) {
		// Complete this function
		String str = "";
		int largest = 0;
		int pos = 0;
		for (int j = 1; j < grid.toCharArray().length - 1; j++) {
			int digit = Integer.valueOf(grid.toCharArray()[j]);
//			System.out.println("digit " + digit);
			if (digit > largest) {
				largest = digit;
				pos = j;
			}
//			System.out.println("position " + pos);
//			System.out.println("largest " + largest);
			str = grid.replace(grid.toCharArray()[pos], 'X');

		}
		System.out.println(str);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n = in.nextInt();
		String[] grid = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
			if (grid_i == 0 || grid_i == n - 1)
				System.out.println(grid[grid_i]);
			else {
				cavityMap(grid[grid_i]);
			}
		}
		// String[] result = cavityMap(grid);
		// for (int i = 0; i < result.length; i++) {
		// System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		// }
		// System.out.println("");

		in.close();
	}

}
