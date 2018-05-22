package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {

	static String gridChallenge(String[] grid) {
		String possible = "YES";
		for (int i = 0; i < grid.length; i++) {
			char[] cArray = grid[i].toCharArray();
			Arrays.sort(cArray);
			String s = new String(cArray);
			grid[i] = s;
//			System.out.println(grid[i]);
			if (i > 0) {
				for (int j = 0; j < s.length(); j++) {
					if (grid[i].charAt(j) < grid[i - 1].charAt(j)) {
						possible = "NO";
						break;
					}
				}
			}
		}
		return possible;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			// System.out.println("t " + i);
			int n = in.nextInt();
			// System.out.println("n " + n);

			String[] grid = new String[n];
			for (int j = 0; j < n; j++) {
				grid[j] = in.next();
				// if(i==79)
				// System.out.println("grid["+j+"] " + grid[j]);
			}
			String result = gridChallenge(grid);
			System.out.println(result);
			// System.out.println(result);
		}
		in.close();
	}

}
