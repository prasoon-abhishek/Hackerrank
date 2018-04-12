package hackerrank.algorithm.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JumpingClouds {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter num of clouds");
		int n = in.nextInt();
		System.out.println("enter jump distance");
		int k = in.nextInt();
		System.out.println("enter " + n + " clouds");
		int[] c = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		int result = jumpingOnClouds(c, k);
		System.out.println(result);
		in.close();
	}

	private static int jumpingOnClouds(int[] c, int k) {
		int energy = 100;
		int currentIndex = -1;
		int nextIndex = 0;
		while (currentIndex != 0) {
			// nextIndex += k;
			nextIndex = (nextIndex + k >= c.length) ? nextIndex + k - c.length : nextIndex + k;
			// if (nextIndex >= c.length)
			// nextIndex = nextIndex - c.length;
			// System.out.println("nextIndex" + nextIndex);
			currentIndex = nextIndex;
			// System.out.println("currentIndex" + currentIndex);
			energy = (c[nextIndex] == 1) ? energy - 3 : energy - 1;
			// if (c[nextIndex] == 1)
			// energy -= 3;
			// else
			// energy -= 1;

		}
		return energy;
	}
}
