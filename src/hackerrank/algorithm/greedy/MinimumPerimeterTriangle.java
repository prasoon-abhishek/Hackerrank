package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumPerimeterTriangle {

	static void maximumPerimeterTriangle(long[] l) {
		Arrays.sort(l);
		long[] arr = new long[3];
		long maxPerimeter = 0;
		for (int i = 1; i < l.length - 1; i++) {
			if (l[i - 1] + l[i] > l[i + 1]) {
				long perimeter = l[i - 1] + l[i] + l[i + 1];
				if (perimeter > maxPerimeter) {
					maxPerimeter = perimeter;
					arr[0] = l[i - 1];
					arr[1] = l[i];
					arr[2] = l[i + 1];
				}
			}
		}
		if (maxPerimeter > 0)
			System.out.print(arr[0] + " " + arr[1] + " " + arr[2]);
		else
			System.out.println("-1");
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] l = new long[n];
		for (int l_i = 0; l_i < n; l_i++) {
			l[l_i] = in.nextLong();
		}
		maximumPerimeterTriangle(l);
		// int[] result = maximumPerimeterTriangle(l);
		// for (int i = 0; i < result.length; i++) {
		// System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		// }
		// System.out.println("");

		in.close();
	}
}
