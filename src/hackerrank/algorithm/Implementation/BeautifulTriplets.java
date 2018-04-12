package hackerrank.algorithm.Implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulTriplets {

	static int beautifulTriplets(int d, int[] arr) {
		// Complete this function
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] == d) {
					for (int k = j + 1; k < arr.length; k++) {
						if (arr[k] - arr[j] == 3) {
							count++;
							// break;
						}

					}
				}
			}
		}
		return count;
	}

	static int beautifulTriplets1(int d, int[] arr) {
		int count = 0;
		Set<Integer> mSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (mSet.contains(arr[i] - d) && mSet.contains(arr[i] - 2 * d)) {
				count++;
			}
			mSet.add(arr[i]);
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter n and d");
		int n = in.nextInt();
		int d = in.nextInt();
		int[] arr = new int[n];
		System.out.println("enter " + n + " numbers");
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = beautifulTriplets(d, arr);
		System.out.println(result);
		in.close();
	}

}
