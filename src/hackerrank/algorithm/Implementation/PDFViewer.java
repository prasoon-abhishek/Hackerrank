package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class PDFViewer {

	static int designerPdfViewer(int[] h, String word) {
		char[] cArray = word.toCharArray();
		// char ch = cArray[0];
		int highest = 0;
		int index = 0;
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < cArray.length; i++) {
			System.out.print(alphabet.indexOf(cArray[i]) + 1);
			index = alphabet.indexOf(cArray[i]);
			if (h[index] > highest)
				highest = h[index];
		}
		return word.length() * highest;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		int result = designerPdfViewer(h, word);
		System.out.println(result);
		in.close();
	}

}
