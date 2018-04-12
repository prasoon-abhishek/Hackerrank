package hackerrank.algorithm.Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class ClimbingTheLeaderBoard {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		// Map<Integer, Integer> mMap = new HashMap<>();
		//
		int[] mArray = new int[alice.length];
		ArrayList<Integer> mList = new ArrayList<>();

		// scores[scores.length - 1] = 201;
		for (int i = 1; i < scores.length; i++) {

			if (scores[i] != scores[i - 1]) {
				mList.add(scores[i - 1]);

			}
		}
		System.out.println(mList);
		int a = 0;

		for (int i = 0; i < alice.length; i++) {

			for (int n = mList.size() - 1; n >= 0; n--) {
				// System.out.println("mMap.get(n).get(0)" +
				// mMap.get(n).get(0));
				// System.out.println("n " + n + " mList" + mList.get(n));
				try {
					System.out.println("alice[i]" + alice[i] + " mList.get(n) " + mList.get(n));
					if (alice[i] >= mList.get(n)) {
						a = n + 1;
						mList.remove(n);
						n = mList.size();
						System.out.println(mList);
					} else {
						a = n + 2;
						System.out.println(mList);
						break;
					}
				} catch (Exception e) {

				}

			}
			mArray[i] = a;
			// System.out.println(a);
		}
		// System.out.println(mMap);
		return mArray;
	}

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n + 1];
		System.out.println("enter " + n + " elements");
		for (int scores_i = 0; scores_i < n; scores_i++) {
			scores[scores_i] = in.nextInt();
		}
		System.out.println("enter m");
		int m = in.nextInt();
		int[] alice = new int[m];
		System.out.println("enter " + m + " elements");
		for (int alice_i = 0; alice_i < m; alice_i++) {
			alice[alice_i] = in.nextInt();
		}
		int[] result = climbingLeaderboard(scores, alice);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}
}
