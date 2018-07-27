package hackerrank.algorithms.strings;

import java.util.Scanner;

public class CaesarCipher {

	static String caesarCipher(String str, int k) {
		StringBuilder builder = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i);
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				index += k;
				index = 97 + ((index - 97) % 26);

			} else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				index += k;
				index = 65 + ((index - 65) % 26);

			}
			builder.append((char)index);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		int k = scan.nextInt();
		System.out.println(caesarCipher(str, k));
	}
}
