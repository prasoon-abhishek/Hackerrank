package hackerrank_algorithms;

import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		System.out.println("enter no. of birds: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		System.out.println("enter " + n + " birds: ");
		for (int types_i = 0; types_i < n; types_i++) {
			types[types_i] = in.nextInt();
		}
		int count = 0;
		int mostRepeatedNum = 0;
		int timesRepeated = 0;
		for (int i = 0; i < n; i++) {
			int mCount = count;
			count = 0;
			for (int j = 0; j < n; j++) {
				if (types[i] == types[j]) {
					count++;

					if (count > mCount) {
						timesRepeated = count;
						mostRepeatedNum = types[i];

					}

				}
			}
		}
		System.out.println(timesRepeated + " " + mostRepeatedNum);

	}

}
