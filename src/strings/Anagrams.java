package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static Boolean isAnagram(String a, String b) {
		// a = a.substring(0).toLowerCase();
		// b = b.substring(0).toLowerCase();
		char[] charArraya = a.toLowerCase().toCharArray();
		Arrays.sort(charArraya);
		// a=new String(charArraya);
		char[] charArrayb = b.toLowerCase().toCharArray();
		Arrays.sort(charArrayb);
		// b=new String(charArrayb);
		return Arrays.equals(charArraya, charArrayb);
	}

	public static void main(String[] args) {
		System.out.println("enter 2 strings");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		// System.out.println(sortAlphabetically(a));
		String b = scan.next();
		// System.out.println(sortAlphabetically(b));
		// System.out.println(sortAlphabetically(a).contentEquals(sortAlphabetically(b)));
		// System.out.println(sortAlphabetically(a).contentEquals(sortAlphabetically(b))
		// ? "Anagrams" : "Not Anagrams");
		System.out.println(isAnagram(a, b));
	}

}
