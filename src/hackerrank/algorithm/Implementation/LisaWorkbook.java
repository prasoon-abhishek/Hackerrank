package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class LisaWorkbook {

	static int workbook(int n, int k, int[] arr) {
		// Complete this function
		int count = 0;
		int page = 0;
		for (int i = 0; i < arr.length; i++) {
			page++;
			int chapters = arr[i];
			int kTrack = k;
			for (int j = 1; j <= chapters; j++) {
				if (j > kTrack) {
					page++;
					kTrack += k;
				}
				if (page == j)
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter n and k");
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		System.out.println("enter " + n + " elements");
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = workbook(n, k, arr);
		System.out.println(result);
		in.close();
	}

}
