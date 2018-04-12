package hackerrank.java.data_structures;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrays {
	public static void main(String[] args) {
		System.out.println("enter length of array");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("enter " + num + " elements");
		int[] arr = new int[num];
		int count = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		for (int j = 0; j < num; j++) {
			int sum = 0;
			for (int k = j; k < num; k++) {
				sum += arr[k];
				if (sum < 0)
					count++;
			}
		}
		System.out.println(count);
	}

}
