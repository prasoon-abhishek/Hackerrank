package interview_prep_kit.arrays;

import java.util.Scanner;

public class ArrayManipulation {
	
	static void printArray(long[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] arr=new long[n+1];
		int m=in.nextInt();
		for(int j=0;j<m;j++){
			int startIndx=in.nextInt();
			int endIndx=in.nextInt();
			int value=in.nextInt();
			/*for(int i=startIndx;i<=endIndx;i++){
				arr[i]+=value;
				if(arr[i]>max)
					max=arr[i];
				
			}*/
			arr[startIndx]+=value;
			if(endIndx<n)
				arr[endIndx+1]-=value;
			
		}
		long max=0,temp=arr[1];
		for(int i=2;i<arr.length;i++){
			arr[i]+=temp;
			temp=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
//		printArray(arr);
		System.out.println(max);
	}
}
