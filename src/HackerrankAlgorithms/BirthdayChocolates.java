package HackerrankAlgorithms;

import java.util.Scanner;

public class BirthdayChocolates {
	static int getWays(int[] s, int d, int m) {
		// Complete this function
		int count = 0;
		
	
		for(int i=0;i<=s.length-m;i++){
			int sum=0;
			for(int j=i;j<i+m;j++){
				sum=sum+s[j];
			}System.out.println("sum "+sum);
			if(sum==d)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("enter no. of squares in chocolate bar: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("enter " + n + " values of chocolate bar squares: ");
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("enter birth month and birth day of Ron:");
		int d = in.nextInt();
		int m = in.nextInt();
		
		int result = getWays(s, d, m);
		System.out.println("result "+result);
	}
}
