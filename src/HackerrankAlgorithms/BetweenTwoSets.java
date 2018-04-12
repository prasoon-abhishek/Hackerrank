package HackerrankAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class BetweenTwoSets {
	public static void main(String[] args) {
		System.out.println("enter no. of elements in a & b: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.println("enter " + n + " elements in a: ");
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		System.out.println("enter " + m + " elements in b: ");
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		if(b[0]<a[n-1]){
			System.out.println("0");
		}else{

		int[] numBetweenAB = new int[b[0] - a[n - 1] + 1];
		

		int nextNum = a[n - 1];

		for (int i = 0; i < numBetweenAB.length; i++) {
			numBetweenAB[i] = nextNum;
			nextNum++;
			//System.out.println("num b/w a and b " + numBetweenAB[i]);
		}
		int count;
		int count2 = 0;
		int factor = 0;
		int total = 0;

		for (int i = 0; i < numBetweenAB.length; i++) {
			count = 0;

			for (int j = 0; j < a.length; j++) {
				if (numBetweenAB[i] % a[j] == 0) {
					count++;
				}
			}

			if (count == a.length) {
//				System.out.println("All elements in a are factors of "
//			    + numBetweenAB[i]);
				factor = numBetweenAB[i];
				//System.out.println("factor "+factor);
				count2=0;
				for (int k = 0; k < b.length; k++) {
					if (b[k] % factor == 0) {
						count2++;
					}
					//System.out.println("factors "+factor+" count "+count2);
				}
				if(count2==b.length){
					total++;
					//System.out.println("factors "+factor);
					
				}
			}

		}System.out.println(total);
		
		}
	}
}
