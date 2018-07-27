package competions.week_of_code_38;

import java.util.Scanner;

public class MinuteToWait {

	static int minuteToWinIt(int[] a, int k) {
		int counter = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1] + k) {
				
//				a[i] = a[i - 1] + k;
				counter++;
			}

		}
		return counter;
	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int result = minuteToWinIt(a, k);
		// System.out.println();
		System.out.println(result);
	}
}
