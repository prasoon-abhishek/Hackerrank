package hackerrank.algorithm.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsGreater {

	static String biggerIsGreater(String w) {
		char[] numArray = w.toCharArray();
		char[] suffix = getSuffix(numArray);
//		System.out.println("suffix " + new String(suffix));
		if (suffix.length < w.length()) {
			int pivotIndex = w.length() - suffix.length - 1;
			int swapIndex = getSwapIndex(suffix, numArray, pivotIndex);
			// System.out.println(" swapIndex " + swapIndex);
			char temp = suffix[swapIndex];
			suffix[swapIndex] = numArray[pivotIndex];
			numArray[pivotIndex] = temp;
		} else {
		return	"no answer";
		}
		// System.out.println("length "+(numArray.length-suffix.length));
		Arrays.sort(suffix);
		int n = 0;
		for (int i = numArray.length - suffix.length; i < numArray.length; i++) {
			numArray[i] = suffix[n++];
		}

		return new String(numArray);
	}

	public static int getSwapIndex(char[] suffix, char[] numArray, int pivotIndex) {

		// System.out.println("pivot " + pivotIndex);
		int minDifference = suffix[0] - numArray[pivotIndex];
		int swapIndex = 0;
		for (int i = 1; i < suffix.length; i++) {
			int diff = suffix[i] - numArray[pivotIndex];
			if (diff < minDifference && suffix[i] > numArray[pivotIndex]) {
				minDifference = diff;
				swapIndex = i;
			}
		}
		return swapIndex;
	}

	public static char[] getSuffix(char[] numArray) {
		int count = 1;
		for (int i = numArray.length - 1; i > 0; i--) {
			char num = numArray[i];
			if (num <= numArray[i - 1]) {
				count++;
			} else {
				break;
			}
		}
		char[] suffix = new char[count];
		int index = numArray.length - count;
		for (int i = 0; i < count; i++) {

			suffix[i] = numArray[index++];
		}
		return suffix;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			String w = in.next();
			String result = biggerIsGreater(w);
			System.out.println(result);
		}
		in.close();
	}

}
