package hackerrank_algorithms;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SocksMerchant {

	static void countPairs(int n, ArrayList<Integer> socks) {
		int count;
		int first;
		ArrayList<Integer> pairs = new ArrayList<>();
		for(int i=0;i<socks.size();i++){
			
		}

//		int freq=0;
//		freq=freq+Collections.frequency(socks,1);
//		System.out.println(freq);
//		int sum = 0;
//		for (int i = 0; i < pairs.size(); i++) {
//			sum = sum + pairs.get(i);
//		}
//		System.out.println(sum);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		System.out.println("enter " + n + " numbers.");
		ArrayList<Integer> socks = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			socks.add(scan.nextInt());
		}
		countPairs(n, socks);

	}
}
