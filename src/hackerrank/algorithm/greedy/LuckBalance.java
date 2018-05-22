package hackerrank.algorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LuckBalance {

	static int luckBalance( int canLose, int[][] contests, int mustWin, int totalLuck, ArrayList<Integer> luckArray) {
		int luck = 0;

		if (canLose < mustWin) {
			mustWin -= canLose;
			Collections.sort(luckArray);
			
			for (int i = 0; i < mustWin; i++) {
				// System.out.println("totalLuck " + totalLuck);
				// System.out.println("luckArray[i] " + luckArray[i]);
				totalLuck -= 2 * luckArray.get(i);

			}

		}
		luck = totalLuck;
		return luck;
	}

	static void printArray(int[] arr) {
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println();
		int mustWin = 0;
		int totalLuck = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int canLose = in.nextInt();
		int[][] contests = new int[n][2];
		ArrayList<Integer> luckArray = new ArrayList<>();
		
		for (int contests_i = 0; contests_i < n; contests_i++) {
			for (int contests_j = 0; contests_j < 2; contests_j++) {
				contests[contests_i][contests_j] = in.nextInt();

			}
			totalLuck += contests[contests_i][0];

			// System.out.println(contests[contests_i][0]);
			if (contests[contests_i][1] == 1) {
				mustWin++;
				luckArray.add(contests[contests_i][0]);
			}
			// System.out.println(contests[contests_i][1]);
		}
		int result = luckBalance(canLose, contests, mustWin, totalLuck, luckArray);
		System.out.println(result);
		in.close();
	}

}
