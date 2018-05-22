package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class QueensAttack {

	static int queensAttack(int n, int k, int r_qy, int c_qx, int[][] obstacles) {
		int verticalP = n - r_qy;
		// System.out.println("verticalP " + verticalP);
		int verticalM = r_qy - 1;
		// System.out.println("verticalM " + verticalM);
		int horizontalP = n - c_qx;
		// System.out.println("horizontalP " + horizontalP);
		int horizontalM = c_qx - 1;
		// System.out.println("horizontalM " + horizontalM);

		int diagPP = (n - r_qy) < (n - c_qx) ? n - r_qy : n - c_qx;
//		System.out.println("diagPP " + diagPP);
		int diagPM = (n - r_qy) < (c_qx - 1) ? n - r_qy : c_qx - 1;
		// System.out.println("diagPM " + diagPM);
		int diagMM = (r_qy - 1) < (c_qx - 1) ? r_qy - 1 : c_qx - 1;
//		System.out.println("diagMM " + diagMM);
		int diagMP = (r_qy - 1) < (n - c_qx) ? r_qy - 1 : n - c_qx;
		// System.out.println("diagMP " + diagMP);

		for (int i = 0; i < k; i++) {
			int y = obstacles[i][0];
			int x = obstacles[i][1];
			if (x == c_qx && y > r_qy && y - r_qy < verticalP) {
				verticalP = y - r_qy - 1;
			} else if (x == c_qx && y < r_qy && r_qy - y < verticalM) {
				verticalM = r_qy - y - 1;
			} else if (y == r_qy && x > c_qx && x - c_qx < horizontalP) {
				horizontalP = x - c_qx - 1;
			} else if (y == r_qy && x < c_qx && c_qx - x < horizontalM) {
				horizontalM = c_qx - x - 1;
			} else if (Math.abs(y - r_qy) == Math.abs(x - c_qx) && y > r_qy && x > c_qx) {
				if (y - r_qy < diagPP)
					diagPP = y - r_qy - 1;
			} else if (Math.abs(y - r_qy) == Math.abs(x - c_qx) && y > r_qy && x < c_qx) {
				if (y - r_qy < diagPM)
					diagPM = y - r_qy - 1;
			}

			else if (Math.abs(y - r_qy) == Math.abs(x - c_qx) && y < r_qy && x < c_qx) {
				if (r_qy - y < diagMM)
					diagMM = r_qy - y - 1;
			} else if (Math.abs(y - r_qy) == Math.abs(x - c_qx) && y < r_qy && x > c_qx) {
				if (r_qy - y < diagMP)
					diagMP = r_qy - y - 1;
			}

		}
//		System.out.println("verticalP " + verticalP);
//		System.out.println("verticalM " + verticalM);
//		System.out.println("horizontalP " + horizontalP);
//		System.out.println("horizontalM " + horizontalM);
//		System.out.println("diagPP " + diagPP);
//		System.out.println("diagPM " + diagPM);
//		System.out.println("diagMM " + diagMM);
//		System.out.println("diagMP " + diagMP);
		return verticalP + verticalM + horizontalP + horizontalM + diagPP + diagPM + diagMM + diagMP;
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
