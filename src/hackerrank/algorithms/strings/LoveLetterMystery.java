package hackerrank.algorithms.strings;

import java.util.Scanner;

public class LoveLetterMystery {

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String str = scan.next();
			int index = str.length() - 1;
			int count = 0;
			for (int j = 0; j < str.length() / 2; j++) {
				count += Math.abs(str.charAt(j) - str.charAt(index));
				index--;
			}
			System.out.println(count);
		}
	}
}
