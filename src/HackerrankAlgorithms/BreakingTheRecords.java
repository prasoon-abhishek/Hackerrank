package HackerrankAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class BreakingTheRecords {
	static int countMax=0;
	static int countMin=0;
	
	static int[] getRecord(int[] s) {
		// Complete this function
		
		int first = s[0];
		int j=0;
		
		int[] result1=new int[s.length];
		
		for(int i=1;i<s.length;i++){
			if(first>s[i] ){
				countMin++;
				first=s[i];
				result1[j]=s[i];
				j++;
			}
		}
		first=s[0];
		for(int i=1;i<s.length;i++){
			if(first<s[i] ){
				countMax++;
				first=s[i];
				result1[j]=s[i];
				j++;
			}
		}
		int [] count={countMax,countMin};
		return result1;
		
	}

	public static void main(String[] args) {
		System.out.println("enter no of testcases:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		System.out.println("enter " + n + " testcases:");
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int[] result = getRecord(s);
		System.out.println("countMax: "+countMax);
		System.out.println("countMin: "+countMin);
//		for(int i=0;i<result.length;i++){
//			System.out.println(result[i]);
//		}
		 
	}
}
