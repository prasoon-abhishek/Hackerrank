package hackerrank.algorithms.strings;

public class CamelCase {

	static void camelCase(String s) {
		// Complete this function
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				count++;
		}
		System.out.println(count+1);
		
	}

	public static void main(String[] args) {
		camelCase("saveChangesInTheEditor");
	}

}
