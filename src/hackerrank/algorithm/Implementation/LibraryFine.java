package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class LibraryFine {

	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		// Complete this function
		if (y1 - y2 < 0)
			return 0;
		else if (y1 - y2 > 0)
			return 10000;
		else {
			if (m1 - m2 > 0)
				return 500 * (m1 - m2);
			else if (m1 - m2 < 0)
				return 0;
			else {
				if (d1 - d2 > 0)
					return 15 * (d1 - d2);
				else {
					return 0;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter d1 m1 y1");
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		System.out.println("enter d2 m2 y2");
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		int result = libraryFine(d1, m1, y1, d2, m2, y2);
		System.out.println(result);
		in.close();
	}

}
