package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class JumpingOnClouds {

	static int jumpingOnClouds(int[] c) {
		// Complete this function
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			System.out.println("i " + i);
			if ((i + 2) <= (c.length - 1)) {
				if (c[i + 2] != 1)
					i++;
			}
			if (i >= c.length - 1)
				break;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter n");
		int n = in.nextInt();
		int[] c = new int[n];
		System.out.println("enter " + n + " numbers");
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		int result = jumpingOnClouds(c);
		System.out.println(result);
		in.close();
	}

}
