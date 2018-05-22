package hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;;

public class JimAndOrders {

	static void jimOrders(int[] arr, Map<Integer, Integer> map) {
		Arrays.sort(arr);
		printArray(arr);
		for (int i = 0; i < arr.length; i++) {
			int val = map.get(arr[i]) + 1;
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
	static void printArray(int[] arr) {
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		for (int orders_i = 0; orders_i < n; orders_i++) {

			int order = in.nextInt();
			int time = in.nextInt();
			arr[orders_i] = order + time;

			map.put(arr[orders_i], orders_i);

		}
		System.out.println(map);
		System.out.println();
		jimOrders(arr, map);

		in.close();
	}

}
