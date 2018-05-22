package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class QuensAttack2 {

	static int queensAttack(int n, int k, int r_qy, int c_qx, int[][] obstacles) {
		int verticalP = r_qy, maxVerticalP = n;
		int verticalM = r_qy, minVerticalM = 1;
		int horizontalP = c_qx, maxHorizontalp = n;
		int hprizontalM = c_qx, minHorizontalM = 1;		

		for (int i = 0; i < obstacles.length; i++) {
			int y = obstacles[i][0];
			int x = obstacles[i][1];
			if (x == c_qx && y >= verticalP && y <= maxVerticalP) {
				maxVerticalP = y - 1;
			}
			if (x == c_qx && y <= verticalM && y >= minVerticalM) {
				minVerticalM = y + 1;
			}
			if (y == r_qy && x >= horizontalP && x <= maxHorizontalp) {
				maxHorizontalp = x - 1;
			}
			if (y == r_qy && x <= hprizontalM && x >= minHorizontalM) {
				minHorizontalM = x + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int r_q = in.nextInt();
		int c_q = in.nextInt();
		int[][] obstacles = new int[k][2];
		for (int obstacles_i = 0; obstacles_i < k; obstacles_i++) {
			for (int obstacles_j = 0; obstacles_j < 2; obstacles_j++) {
				obstacles[obstacles_i][obstacles_j] = in.nextInt();
			}
		}

		int result = queensAttack(n, k, r_q, c_q, obstacles);

		System.out.println(result);
		in.close();
	}

}
