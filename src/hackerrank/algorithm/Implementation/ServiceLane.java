package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class ServiceLane {

	static int serviceLane(int[] width, int from, int to) {

		int smallest = 10;
		for (int i = from; i <= to; i++) {
			if (width[i] < smallest)
				smallest = width[i];
		}
		return smallest;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter n");
		int n = in.nextInt();
		System.out.println("enter t");
		int t = in.nextInt();
		int[] width = new int[n];
		System.out.println("enter " + n + " numbers");
		for (int width_i = 0; width_i < n; width_i++) {
			width[width_i] = in.nextInt();
		}
		for (int i = 0; i < t; i++) {
			System.out.println("enter from index and to index");
			int from = in.nextInt();
			int to = in.nextInt();
			System.out.println(serviceLane(width, from, to));
		}

		in.close();
	}
}
