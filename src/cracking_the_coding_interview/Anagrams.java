package cracking_the_coding_interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Anagrams {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println();
		String a = scanner.nextLine();
		Map<Character, Integer> aMap = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (aMap.containsKey(c)) {
				aMap.put(c, aMap.get(c) + 1);
			} else {
				aMap.put(c, 1);
			}
		}
//		System.out.println(aMap);
		String b = scanner.nextLine();
		StringBuilder builder = new StringBuilder("");
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (aMap.containsKey(c)){
				if(aMap.get(c)>1)
					aMap.put(c, aMap.get(c)-1);
				else
					aMap.remove(c);
			}
			
			else
				builder.append(c);
		}
		int count = 0;
		Set<Character> mSet=aMap.keySet();
		for(char i:mSet){
			count +=aMap.get(i);
		}
		System.out.println(count + builder.length());
		scanner.close();
	}

}
