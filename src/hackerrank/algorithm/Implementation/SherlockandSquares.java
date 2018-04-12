package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class SherlockandSquares {

	static int squares(int a, int b) {
		// Complete this function
		int count = 0;

		 for (int i = a; i <= b; i++) {
		 int sqroot = (int) Math.sqrt(i);
		
		 // System.out.println("i " + i);
		 if (sqroot * sqroot == i) {
		 count++;
		 i = i + (2 * sqroot);
		
		 }
		 }
//		int sqroot = (int) Math.sqrt(a);
//		sqroot++;
//		int square = (sqroot) * (sqroot);
//		while (square <= b) {
//			square += 1 + (2 * sqroot);
//			sqroot++;
//			System.out.println("square " + square);
//			System.out.println("squareRoot " + sqroot);
//
//			count++;
//		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter no. of entries");
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			System.out.println("enter a and b");
			int a = in.nextInt();
			int b = in.nextInt();
			int result = squares(a, b);
			System.out.println(result);
		}
		in.close();
	}

}
