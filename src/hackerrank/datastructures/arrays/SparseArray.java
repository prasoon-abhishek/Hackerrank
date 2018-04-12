package hackerrank.datastructures.arrays;

import java.util.Scanner;

public class SparseArray {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter n");
		int n = scan.nextInt();
		String[] nStrArray = new String[n];
		System.out.println("enter " + n + " strings");
		String s = scan.nextLine();
		for (int i = 0; i < n; i++) {
			nStrArray[i] = scan.nextLine();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(nStrArray[i]);
		}
		System.out.println("enyter q");
		int q = scan.nextInt();
		String a = scan.nextLine();
		for (int i = 0; i < q; i++) {
			int count = 0;
			String str = scan.nextLine();
			System.out.println("str " + str);
			for (int j = 0; j < n; j++) {
				System.out.println(nStrArray[j]);
				if (nStrArray[j].equals( str))
					count++;
			}
			System.out.println(count);
		}
	}
}
