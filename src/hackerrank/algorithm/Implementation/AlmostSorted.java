package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class AlmostSorted {

	public static void almostSorted(int[] mArray) {
		int upCount = 0, downCount = 0;
		int startIndex = 1;
		int endIndex = mArray.length;
		boolean up = false, down = false;
		for (int i = 0; i < mArray.length - 1; i++) {
			if (mArray[i] < mArray[i + 1]) {

				if (!up ) {
					startIndex = i + 2;
					endIndex = i + 1;
					up = true;
					down=false;
					upCount++;
				}
			} else {
				if (!down) {
					startIndex=i+1;
					endIndex=i+1;
					downCount++;
					down = true;
					up=false;
				}

			}
		}
		System.out.println("upCount " + upCount + " downCount " + downCount);
		if (!up) {
			System.out.println("yes");
			System.out.println("swap " + startIndex + " " + endIndex);
		} else if (upCount == 1 && downCount == 0) {
			System.out.println("yes");
			System.out.println("reverse " + startIndex + " " + mArray.length);
		} else if (upCount == 1 && downCount == 1) {
			System.out.println("yes");
			System.out.println("swap " + startIndex + " " + mArray.length);
		} else if (upCount == 2) {
			System.out.println("yes");
			System.out.println("reverse " + startIndex + " " + endIndex);
		} else
			System.out.println("no");

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		int n = scan.nextInt();
		int[] mArray = new int[n];
		for (int i = 0; i < n; i++) {
			mArray[i] = scan.nextInt();
		}
		almostSorted(mArray);
	}
}
