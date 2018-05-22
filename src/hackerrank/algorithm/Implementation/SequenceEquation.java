package hackerrank.algorithm.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s="hjgkhkj";
		

		Map<Integer, Integer> map = new HashMap<>();
		for (int p_i = 1; p_i <= n; p_i++) {
			map.put(in.nextInt(), p_i);
		}

		for (int i = 1; i <= map.size(); i++) {
			int num = map.get(i);
			int val = map.get(num);
			System.out.println(val);
		}

		in.close();
	}
}
