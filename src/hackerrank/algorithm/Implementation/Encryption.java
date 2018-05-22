package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class Encryption {

	public static String encryption(String s) {
		String str = s.replace(" ", "");
		StringBuilder builder = new StringBuilder("");
		// System.out.println("length " + str.length());
		double root = Math.sqrt(str.length());
		int column = (int) Math.ceil(root);
		int row = (int) Math.floor(root);
		// System.out.println(row);
		// System.out.println(column);
		for (int i = 0; i < column; i++) {
			for (int j = i; j < str.length();) {
				builder.append(str.charAt(j));
				j = j + column;
			}
			builder.append(" ");
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String result = encryption(s);
		System.out.println(result);
	}
}
