package strings;

import java.util.Scanner;

public class Reverse {

	static String reverse(String s) {
		String sb = new StringBuffer(s).reverse().toString();
		// System.out.println(sb.equals(s)?"Yes":"No");
		return sb.equals(s) ? "Yes" : "No";
	}

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(reverse(s));
	}
}
