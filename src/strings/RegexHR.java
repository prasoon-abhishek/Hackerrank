package strings;

import java.util.Scanner;

public class RegexHR {

	public static void main(String[] args) {
		System.out.println("Enter pattern");
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

	}

}
