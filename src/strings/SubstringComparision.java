package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubstringComparision {

	public static String substringComparision(String s, int i) {

		ArrayList<String> aList = new ArrayList<>();
		for (int j = 0; j <= s.length() - i; j++) {
			String block = s.substring(j, j + i);
			aList.add(block);
			Collections.sort(aList);
			// Collections.sort(aList, String.CASE_INSENSITIVE_ORDER);

		}

		return aList.get(0) + "\n" + aList.get(aList.size() - 1);
	}

	public static void main(String[] args) {
		System.out.println("entrer s and i");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int i = scan.nextInt();
		System.out.println(substringComparision(s, i));
	}
}
