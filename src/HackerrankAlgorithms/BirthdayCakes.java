package HackerrankAlgorithms;

import java.util.Scanner;

public class BirthdayCakes {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("enter no. of candles: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		int largest=height[0];
		for(int i=1;i<n;i++){
			if(largest<height[i]){
				largest=height[i];
			}
		}
		//System.out.println(largest);
		
		
		for(int i=0;i<n;i++){
			if(largest==height[i]){
				count++;
			}
		}System.out.println(count);

	}
}
