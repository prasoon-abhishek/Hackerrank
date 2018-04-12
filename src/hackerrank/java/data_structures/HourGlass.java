package hackerrank.java.data_structures;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		System.out.println("enter 36 elements");
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[6][6];
		int val = 1, maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				try {
					sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
							+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
					System.out.println("sum" + sum);
					if (sum > maxValue)
						maxValue = sum;
				} catch (IndexOutOfBoundsException e) {
					e.getMessage();
				}
			}
			

		}
		System.out.println(maxValue);

	}

}
