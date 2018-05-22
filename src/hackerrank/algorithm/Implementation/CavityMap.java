package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class CavityMap {

	static String[] cavityMap(String[] grid) {

		for (int i = 1; i < grid.length - 1; i++) {
			char[] upper = grid[i - 1].toCharArray();
			System.out.print("upper ");
			printCharArray(upper);
			char[] cArr = grid[i].toCharArray();
			System.out.print("current ");
			printCharArray(cArr);
			char[] lower = grid[i + 1].toCharArray();
			System.out.print("lower ");
			printCharArray(lower);
			for (int j = 1; j < grid.length - 1; j++) {
				System.out.println("j " + j);
				char current = cArr[j];
				System.out.println("current "+current);
				char up = upper[j];
				System.out.println("up "+up);
				char low = lower[j];
				System.out.println("low "+low);
				char right = cArr[j + 1];
				System.out.println("right "+right);
				char left =cArr[j - 1];
				System.out.println("left "+left);
				if (current > up && current > low && current > right && current > left) {
					grid[i]=grid[i].replace(cArr[j], 'X');
				}
			}
		}
		return grid;
	}

	public static void printCharArray(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] grid = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
		}
		String[] result = cavityMap(grid);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}

}
