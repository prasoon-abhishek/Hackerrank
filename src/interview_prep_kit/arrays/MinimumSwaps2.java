package interview_prep_kit.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumSwaps2 {

	static int mimimumSwaps(int[] arr) {
		int last = arr.length - 1;
		int count=0;
		int largest;
		int largestIndex;
		for (int i = last; i > 0; i--) {
			
			 largest = arr[i];
			 largestIndex = i;
			for (int j = 0 ; j <i; j++) {
				if (arr[j] > largest) {
					largest = arr[j];
					largestIndex = j;
					
				}
			
			}
			if(largest!=arr[last]){
			int temp = arr[last];
			arr[last] = largest;
			arr[largestIndex] = temp;
			count++;
			}
			last--;
//			printArray(arr);
		}
		return count;
	}
	static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static int minSwaps(int []arr,Map<Integer,Integer> map ){
		int [] a=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			a[i]=arr[i];
		}
		Arrays.sort(arr);
		int count=0;

		for(int i=0;i<arr.length;i++){
		
			if(a[i]!=arr[i]){
				count++;
				int temp=map.get(arr[i]);
				int temp2=map.get(a[i]);
				map.put(a[i], temp);
				a[temp]=a[temp2];
//				printArray(a);
//				System.out.println(map);
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		Map<Integer,Integer> map=new HashMap<>(n);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			map.put(arr[i], i);
		}
		
		int result=minSwaps(arr, map);
		System.out.println(result);
	}
}
