package hackerrank.algorithms.strings;

import java.util.Scanner;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		System.out.println();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String str=scan.next();
		System.out.println((str.length()-str.replaceAll("010", "").length())/3);
	}
}
