package strings.introduction;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;;

public class intro {

	static void result(String a, String b) {
		System.out.println(a.length() + b.length());
		System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
		System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1) + b.substring(1));
	}

	public static void main(String[] args) {
		System.out.println("enter 2 strings");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		result(a, b);
		// System.out.println((int) a.charAt(0));
	}
}
