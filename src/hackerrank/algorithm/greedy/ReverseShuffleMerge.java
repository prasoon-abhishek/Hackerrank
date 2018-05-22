package hackerrank.algorithm.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseShuffleMerge {

	static String reverseShuffleMerge(String s) {
		StringBuilder builder = new StringBuilder("");
		char[] arr = s.toCharArray();
		ArrayList<Integer> counted=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(!counted.contains(arr[i])){
				
			}
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = reverseShuffleMerge(s);
		System.out.println(result);
		in.close();
	}

}
