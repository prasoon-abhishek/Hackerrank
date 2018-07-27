package interview_prep_kit.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void countSwaps(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
//			printArray(arr);
			boolean isSwapped = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
					count++;
				}
			}
			if (!isSwapped) {
				break;
			}
		}
		System.out.println("Array is sorted in "+ count +" swaps");  
		System.out.println("First Element: "+arr[0]);  
		System.out.println("Last Element: "+arr[arr.length-1]); 
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		countSwaps(arr);
	}
}
