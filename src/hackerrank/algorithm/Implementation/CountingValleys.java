package hackerrank.algorithm.Implementation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingValleys {
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		// DDUUDDUDUUUD
		int v = 0; // # of valleys
		int lvl = 0; // current level
		for (char c : s.toCharArray()) {
			// if (c == 'U') {
			// lvl++;
			// // System.out.println("up"+v);
			// } else {
			// lvl--;
			// // System.out.println("down"+v);
			// }
			lvl = (c == 'U') ? lvl+1 : lvl-1;

			// if we just came UP to sea level
			if (lvl == 0 && c == 'U')
				v++;
		}
		System.out.print(v);
	}
}
