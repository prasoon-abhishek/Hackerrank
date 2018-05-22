package hackerrank.algorithm.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class NextLexicographicalPermutation {

	static int[] findNextLexicographPermutation(int[] numArray) {

		int[] suffix = getSuffix(numArray);

		if (suffix.length < numArray.length) {
			int pivotIndex = numArray.length - suffix.length - 1;
			int swapIndex = getSwapIndex(suffix, numArray, pivotIndex);
			// System.out.println(" swapIndex " + swapIndex);
			int temp = suffix[swapIndex];
			suffix[swapIndex] = numArray[pivotIndex];
			numArray[pivotIndex] = temp;
		} else {
			System.out.println("no answer");
		}
		// System.out.println("length "+(numArray.length-suffix.length));
		Arrays.sort(suffix);
		int n = 0;
		for (int i = numArray.length - suffix.length; i < numArray.length; i++) {
			numArray[i] = suffix[n++];
		}

		return numArray;
	}

	public static int getSwapIndex(int[] suffix, int[] numArray, int pivotIndex) {

//		System.out.println("pivot " + pivotIndex);
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

	public static int[] getSuffix(int[] numArray) {
		int count = 1;
		for (int i = numArray.length - 1; i > 0; i--) {
			int num = numArray[i];
			if (num <= numArray[i - 1]) {
				count++;
			} else {
				break;
			}
		}
		int[] suffix = new int[count];
		int index = numArray.length - count;
		for (int i = 0; i < count; i++) {

			suffix[i] = numArray[index++];
		}
		return suffix;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numArray = new int[n];
		for (int i = 0; i < n; i++) {
			numArray[i] = scan.nextInt();
		}

		int[] resultArray = findNextLexicographPermutation(numArray);
		for (int i : resultArray)
			System.out.print(i + " ");
	}
}
