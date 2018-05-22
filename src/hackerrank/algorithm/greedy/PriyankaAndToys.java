package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys {

	static int toys(int[] w) {
		Arrays.sort(w);
		int boxCount = 1;
		int smallest = w[0];
		for (int i = 1; i < w.length; i++) {
			if (w[i] - smallest > 4) {
				smallest = w[i];
				boxCount++;
			}
		}
		return boxCount;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] w = new int[n];
		for (int w_i = 0; w_i < n; w_i++) {
			w[w_i] = in.nextInt();
		}
		int result = toys(w);
		System.out.println(result);
		in.close();
	}

}
