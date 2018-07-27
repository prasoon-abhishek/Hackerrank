package hackerrank.algorithm.Implementation;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ManasaAndStones {

	static Set<Integer> stones(int n, int a, int b) {
		SortedSet<Integer> mSet = new TreeSet<>();
		int num = a * (n - 1);
		for (int i = 0; i < n; i++) {
			mSet.add(num);
			num += (b - a);
		}

		return mSet;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			Set<Integer> resultSet = stones(n, a, b);
			for (Integer j : resultSet) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
