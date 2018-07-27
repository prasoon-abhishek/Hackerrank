package hackerrank.algorithms.strings;

import java.util.Scanner;

public class HackerrankInAString {

	static String hackerrankInAString(String str){
		String hackerrank="hackerrank";
		int j=0;
		for(int i=0;i<str.length();i++){
			if(j<str.length() && str.charAt(i)==hackerrank.charAt(j))
				j++;
		}
		return (j==hackerrank.length())?"YES":"NO";
	}
	
	public static void main(String[] args) {
		System.out.println();
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			String str=scanner.next();
			System.out.println(hackerrankInAString(str));
		}
	}
}
