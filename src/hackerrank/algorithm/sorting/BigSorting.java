package hackerrank.algorithm.sorting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

	/*
	 * static String[] bigSorting(String[] unsorted) { return unsorted;
	 * 
	 * }
	 */

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println();
		int n = scanner.nextInt();
		String[] unsorted = new String[n];
		for (int i = 0; i < n; i++)
			unsorted[i] = scanner.next();

		Arrays.sort(unsorted, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return stringAsIntCompare(o1, o2);
			}

		});

		for (int i = 0; i < n; i++)
			System.out.println(unsorted[i]);

	}

	static int stringAsIntCompare(String o1, String o2) {
		if (o1.length() > o2.length())
			return 1;
		if (o1.length() < o2.length())
			return -1;
		for (int i = 0; i < o1.length(); i++) {
			if ((int) o1.charAt(i) > (int) o2.charAt(i))
				return 1;
			if ((int) o1.charAt(i) < (int) o2.charAt(i))
				return -1;
		}
		return 0;
	}

}
