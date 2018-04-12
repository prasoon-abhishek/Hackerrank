package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class KaprekarNumbers {

	static boolean kaprekarNumbers(int p, int q) {
		// Complete this function
		boolean istrue = false;

		for (int i = p; i <= q; i++) {
			if (i > 9) {
				int numLength = String.valueOf(i).length();
				String numSquare = String.valueOf((long) i * i);
				String rightString = numSquare.substring(numSquare.length() - numLength);
				String leftString = numSquare.substring(0, numSquare.length() - numLength);
				// System.out.println("i " + i + " leftString " + leftString + "
				// rightString " + rightString);
				int rightInt = Integer.parseInt(rightString);
				int leftInt = Integer.parseInt(leftString);
				if (rightInt != 0) {
					if (rightInt + leftInt == i) {
						System.out.println(i);
						istrue = true;
					}
				}
			} else {
				if (i == 1 || i == 9) {
					System.out.println(i);
					istrue = true;
				}
			}
		}
		return istrue;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter p and q");
		int p = in.nextInt();
		int q = in.nextInt();
		boolean istrue=kaprekarNumbers(p, q);
		if(!istrue)
			System.out.println("INVALID RANGE");
		// int[] result = kaprekarNumbers(p, q);
		// for (int i = 0; i < result.length; i++) {
		// System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		// }
		// System.out.println("");

		in.close();
	}

}
