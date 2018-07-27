package hackerrank.algorithm.Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters {

	static int twoCharacters(String s) {
		ArrayList<Character> mList=new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2=s.charAt(i+1);
			if(!mList.contains(c1) || !mList.contains(c2)){
				
			}
				mList.add(c1);
				mList.add(c2);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		String str = scan.nextLine();
		twoCharacters(str);
	}
}
