package strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {
	public static void main(String[] args) {
		System.out.println("Enter text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine().trim();
		int size = 0;
		String[] words = text.split("[ .,?!'@_]+");
		if (!text.isEmpty())
			size = words.length;
		System.out.println(size);

		for (String s : words) {
			System.out.println(s);
		}

	}
}
