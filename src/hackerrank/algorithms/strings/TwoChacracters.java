package hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TwoChacracters {

	public static int twoCharacters(String s) {
		Set<Character> mSet = new HashSet<>();
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			mSet.add(s.charAt(i));
		}
		List<Character> mList = new ArrayList<>(mSet);
		
		for(int i=0;i<mList.size()-1;i++){
			for(int j=i+1;j<mList.size();j++){
				String str=s.replaceAll("[^" + mList.get(i) + "" + mList.get(j) + "]", "");
				
				if(isAlternating(str)){
					System.out.println(str);
					if(str.length()>maxLength)
						maxLength=str.length();
				}
				
			}
		}
		return maxLength;
	}
	
	public static boolean isAlternating(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
 

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		System.out.println(twoCharacters(s));
	}
}
