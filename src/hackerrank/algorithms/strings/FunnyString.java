package hackerrank.algorithms.strings;

import java.util.Scanner;

public class FunnyString {

	private static String funnyString(String str) {
		String retString = "Funny";
		int first, second, last, secondLast;
		int limit = str.length() - 1, lastLimit = limit;
		for (int i = 0; i < limit/2; i++) {
			first = str.charAt(i);
			second = str.charAt(i + 1);
			last = str.charAt(lastLimit);
			secondLast = str.charAt(lastLimit - 1);
//			System.out.println(first + " " + second + " " + last + " " + secondLast);
			if (Math.abs(first - second) != Math.abs(last - secondLast)) {
				retString = "Not funny";
				break;
			}
			lastLimit--;
		}
		return retString;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int numOfTestCase = scanner.nextInt();
		for (int i = 0; i < numOfTestCase; i++) {
			String str = scanner.next();
			System.out.println(funnyString(str));
		}

	}

}
