package hackerrank_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class SockMerchant {

	 int countPairs(int[] pairs) {
		int count = 0;
		ArrayList<Integer> mArray = new ArrayList<>();

		for (int i = 0; i < pairs.length; i++) {
			Object o=pairs[i];
			
			Integer in=new Integer(pairs[i]);
			if (mArray.contains(in)) {
				mArray.remove(in);
				count++;
			} else
				mArray.add(pairs[i]);
		}
		System.out.println(mArray);
		return count;
		

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of pairs: ");
		int n = scan.nextInt();
		int[] pairs = new int[n];
		System.out.println("enter " + n + "numbers.");
		for (int i = 0; i < n; i++) {
			pairs[i] = scan.nextInt();
		}
//		for(int i=0;i<n;i++){
//			System.out.print(pairs[i]+" ");
//		}
		System.out.println(new SockMerchant().countPairs(pairs));

	}

}
