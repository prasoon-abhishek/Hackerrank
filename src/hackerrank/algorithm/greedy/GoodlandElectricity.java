package hackerrank.algorithm.greedy;

import java.util.Scanner;

public class GoodlandElectricity {

	static int pylons(int k, int[] arr) {
		int nextElement = k - 1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == nextElement) {
				System.out.println("nextElement "+nextElement);
				if (arr[i] == 1)
					nextElement += k + nextElement;

				else
					nextElement += k + nextElement - 1;
				
				count++;
			}
		}
		if(nextElement>=arr.length)
			return count;
		else
			return -1;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = pylons(k, arr);
		System.out.println(result);
		in.close();
	}
}
