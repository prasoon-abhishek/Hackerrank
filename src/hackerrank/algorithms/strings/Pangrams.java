package hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pangrams {

	public static String pangram(String s) {

		List<Integer> cList = new ArrayList<>();
		String r = "not pangram";
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			int ascii = (int) c;
			if ((ascii >= 97 && ascii <= 122) || (ascii >= 65 && ascii <= 90) && ascii != 32) {
				if (ascii >= 65 && ascii <= 90) {
					if (!cList.contains(ascii) && !cList.contains(ascii + 32))
						cList.add(ascii);
				} else {
					if (!cList.contains(ascii) && !cList.contains(ascii - 32))
						cList.add(ascii);
				}
			}
		}
		if (cList.size() == 26)
			r = "pangram";

		return r;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String result = pangram(s);
		System.out.println(result);
	}
}
