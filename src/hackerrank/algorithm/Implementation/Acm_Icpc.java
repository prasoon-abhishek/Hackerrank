package hackerrank.algorithm.Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Acm_Icpc {

	static void acmTeam(int n, int t, String[] topicArray) {
		int maxTopics = 0;
		int numOfWays = 0;
		List<Integer> mList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int topics = 0;
				for (int k = 0; k < t; k++) {
					if (topicArray[i].charAt(k) == '1' || topicArray[j].charAt(k) == '1')
						topics++;
				}
				if (topics >= maxTopics) {
					mList.add(topics);
					maxTopics = topics;
				}
			}

		}
		// System.out.println(mList);
		for (int i : mList) {
			if (i >= maxTopics)
				numOfWays++;
		}
		System.out.println(maxTopics);
		System.out.println(numOfWays);
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		String[] topicArray = new String[n];
		for (int i = 0; i < n; i++) {
			topicArray[i] = scan.next();
		}

		acmTeam(n, t, topicArray);
	}

}
