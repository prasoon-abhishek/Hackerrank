package hackerrank.algorithms.strings;

import java.util.Scanner;

public class MarsExploration {

	static int marsExploration(String str) {
		int count = 0;
		for (int i = 0; i < str.length() / 3; i++) {
			if (str.charAt((i * 3) + 0) != 'S')
				count++;
			if (str.charAt((i * 3) + 1) != 'O')
				count++;
			if (str.charAt((i * 3) + 2) != 'S')
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		System.out.println(marsExploration(str));
	}
}
