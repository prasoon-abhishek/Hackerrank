package hackerrank.algorithm.Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualityInArray {

	static int equalizeArray(int[] arr) {
		// Complete this function
		ArrayList<Integer> mList = new ArrayList<>();
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!mList.contains(arr[i])) {
				mList.add(arr[i]);
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j])
						count++;

				}
				// System.out.println("count " + count);
				if (count > maxCount)
					maxCount = count;
			}
		}
		return arr.length - maxCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter num of elements");
		int n = in.nextInt();
		System.out.println("enter " + n + " elements");
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = equalizeArray(arr);
		System.out.println(result);
		in.close();
	}

}
