package interview_prep_kit.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoStrings {
	public static String twoString (String s1,String s2) {
		String result="NO"; 
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s1.length();i++){
			map.put(s1.charAt(i), 0);
		}
		for(int i=0;i<s2.length();i++){
			if(map.get(s2.charAt(i))!=null){
				result="YES";
				break;
			}
				
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String s1 = scan.next();
			String s2 = scan.next();
			System.out.println(twoString(s1, s2));
		}

	}
}
