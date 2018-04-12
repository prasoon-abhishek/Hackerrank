package strings;

import java.util.Scanner;

public class Substrings {

	static String substring(String s, int start, int end) {

		return s.substring(start, end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 1 string");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int start = scan.nextInt();
		int end = scan.nextInt();
		System.out.println(substring(s, start, end));
	}

}
