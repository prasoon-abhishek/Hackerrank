package hackerrank.java.data_structures;

import java.util.HashSet;
import java.util.Scanner;

public class SetHC {

	public static void main(String[] args) {
		System.out.println("Enter number of pairs: ");
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
			hs.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(hs.size());
		}

	}

}
