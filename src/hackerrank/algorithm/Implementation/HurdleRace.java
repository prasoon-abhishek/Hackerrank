package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class HurdleRace {

	static int hurdleRace(int k, int[] height) {
		int largest = height[0];
		for (int i = 1; i < height.length; i++) {
			if (height[i] > largest)
				largest = height[i];
		}
		return k > largest ? 0 : largest - k;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter n");
		int n = in.nextInt();
		System.out.println("enter k");
		int k = in.nextInt();
		System.out.println("enter " + n + " items");
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		int result = hurdleRace(k, height);
		System.out.println(result);
		in.close();
	}

}
