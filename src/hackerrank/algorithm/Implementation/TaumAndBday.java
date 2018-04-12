package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class TaumAndBday {

	static long taumBday(long b, long w, long x, long y, long z) {
		// Complete this function
		// System.out.println(canChange(x, y, z));
		if (canChange(x, y, z)) {
			if (x < y) {
				return (b * x) + (w * x) + (w * z);
			} else {
				return (b * y) + (w * y) + (b * z);
			}
		} else
//		System.out.println("b" + b + " x" + x + " bx " + b * x);
//		System.out.println("w" + w + " y" + y + " wy " + w * y);
		return ((b * x) + (w * y));
	}

	static boolean canChange(long x, long y, long z) {
		if (x != y && (Math.abs(x - y) > z)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter num of inputs");
		int t = in.nextInt();
		System.out.println("enter ");
		for (int a0 = 0; a0 < t; a0++) {
			long b = in.nextInt();
			long w = in.nextInt();
			long x = in.nextInt();
			long y = in.nextInt();
			long z = in.nextInt();
			long result = taumBday(b, w, x, y, z);
			System.out.println(result);
		}
		in.close();
	}
}
