package hackererank.java.introduction;

import java.util.Scanner;

public class loops2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter no. of inputs");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("enter a,b,n");
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int[] series = new int[n];
			series[0] = a + b;
			for (int j = 1; j < n; j++) {
				series[j] = (int) (series[j - 1] + (Math.pow(2, j)*b));
				//System.out.println(series[j]);
			}
			for(int k=0;k<n;k++){
				System.out.print(series[k]+" ");
			}
			System.out.println("");
			
		}
	}
}
