package hackerank.algorithm.search;

import java.util.Scanner;

public class IcecreamParlour {

	static int[] icecreamParlor(int m, int[] arr) {
		int[] array = new int[2];
		for (int i = 0; i < arr.length; i++) {
			int sunny = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int jonny = arr[j];
				if (sunny + jonny == m) {
					if(i>j){
						array[0]=j+1;
						array[1]=i+1;
						break;
					}
					else{
						array[0]=i+1;
						array[1]=j+1;
						break;
					}
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int m = in.nextInt();
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			int[] result = icecreamParlor(m, arr);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
			}
			System.out.println("");

		}
		in.close();
	}
}
