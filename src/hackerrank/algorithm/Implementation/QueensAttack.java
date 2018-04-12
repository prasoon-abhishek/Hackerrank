package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class QueensAttack {
//
//	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
//		// Complete this function
//		int sidesToMove = movableSides(n, r_q, c_q);
//
//		while (sidesToMove > 0) {
//
//		}
//	}
//
//	static int movableSides(int n, int r_q, int c_q) {
//		int sidesToMove = 0;
//		if (r_q < n && c_q < n)
//			sidesToMove = 8;
//		else if ((r_q == n && c_q < n) || (c_q == n && r_q < n))
//			sidesToMove = 5;
//		else if (r_q == n && c_q == n)
//			sidesToMove = 3;
//
//		return sidesToMove;
//	}
//
//	public static void main(String[] args) {
//		System.out.println();
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int k = in.nextInt();
//		int r_q = in.nextInt();
//		int c_q = in.nextInt();
//		int[][] obstacles = new int[k][2];
//		for (int obstacles_i = 0; obstacles_i < k; obstacles_i++) {
//			for (int obstacles_j = 0; obstacles_j < 2; obstacles_j++) {
//				obstacles[obstacles_i][obstacles_j] = in.nextInt();
//			}
//		}
//		int result = queensAttack(n, k, r_q, c_q, obstacles);
//		System.out.println(result);
//		in.close();
//	}
}
