package hackerrank.algorithms.strings;

public class SuperReducedStrings {

	static void reducedStrings(String str) {

		StringBuffer s = new StringBuffer(str);
		for (int i = 0; i < s.length() -1; i++) {
//			System.out.println("i "+i);
//			System.out.println("s.charAt("+i+") "+ s.charAt(i));
//			System.out.println("s.charAt("+(i+1)+") "+s.charAt(i+1));
			if (s.charAt(i) == s.charAt(i + 1)) {
				s.delete(i, i + 2);
				i = -1;
//				System.out.println("S "+s);
			}
//			System.out.println("i " +i+" "+ "(s.length()-1)" +(s.length()-1));
		}
		
		if (s.length() == 0)
			System.out.println("Empty String");
		else
			System.out.println(s);

	}

	public static void main(String[] args) {
		reducedStrings("aaabccddd");
	}

}
