package interview_prep_kit.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewYearChaos {

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static String minSwaps(int[] a, Map<Integer, Integer> map) {
		int count = 0;
		int end = a.length - 1;
		for (int i = 0; i < end--; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					count++;
					map.put(a[j + 1], map.get(a[j + 1]) + 1);
					if (map.get(a[j + 1]) > 2) {
						return "Too chaotic";
					}
				}
			}
//			printArray(a);
//			System.out.println(map);
		}
//		printArray(a);
		return ("" + count);
	}
	
	public static String minimumBribes(int[] arr){
		int count=0;
		int m=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]-(i+1)>2)
				return "Too chaotic";
			for(int j=i-1;j>=0;j--){
				if(arr[j]>arr[i])
					count++;
			}
		}
		return String.valueOf(count);
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int j = 0; j < t; j++) {

			int n = in.nextInt();
			int[] q = new int[n];
			for (int i = 0; i < n; i++) {
				q[i] = in.nextInt();
			}
			// minimumBribes(a, map);

			String s = minimumBribes(q);
			System.out.println(s);
			// System.out.println("Too chaotic");
		}
	}
}
