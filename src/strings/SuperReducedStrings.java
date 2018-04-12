package strings;

public class SuperReducedStrings {

	static String reducedString(String str) {
		String str2=null;
		char[] charArray = str.toCharArray();
		char first = charArray[0];
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == charArray[i++]) {
				str2=charArray.toString().replace(charArray[i],'\u0000');
			}

		}
		return str2;
	}

	

	public static void main(String[] args) {
		System.out.println(reducedString("aabbcc"));
	}
}
