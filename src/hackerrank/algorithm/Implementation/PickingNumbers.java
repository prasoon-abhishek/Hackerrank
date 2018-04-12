package hackerrank.algorithm.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.rmi.CORBA.Util;

public class PickingNumbers {

	static int pickingNumbers(int[] a) {

		ArrayList<Integer> maxList = new ArrayList<>();
		ArrayList<Integer> newList;
		for (int i = 0; i < a.length; i++) {
			newList = new ArrayList<>();
			newList.add(a[i]);
			for (int j = i + 1; j < a.length; j++) {
				if (Math.abs(a[i] - a[j]) <= 1) {
					newList.add(a[j]);

					System.out.println(newList);
					System.out.println((newList.size() - 1) + " " + (newList.size() - 2));
					if ((Math.abs(newList.get((newList.size() - 2)) - newList.get((newList.size() - 1))) > 1)) {
						if (newList.get(newList.size() - 1) > newList.get(newList.size() - 2))
							newList.remove(newList.size() - 1);
						else
							newList.remove(newList.size() - 2);
					}
				}
			}

			if (newList.size() > maxList.size()) {
				maxList = newList;
			}
		}
		return maxList.size();
	}

	static int pickingNumbers2(int[] a) {
		Map<Integer, Integer> mMap = new HashMap<>();
		int sum = 0;
		int finalSum = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			int num = a[i];

			for (int j = i + 1; j < a.length; j++) {
				if (num == a[j]) {
					count++;
				}
			}
			if (!mMap.containsKey(num)) {
				mMap.put(num, count);
			}
			for (int k = 0; k < mMap.size(); k++) {
				int posSum = 0, negSum = 0;

				posSum = mMap.containsKey(num - 1) ? mMap.get(num) + mMap.get(num - 1) : 0;

				negSum = mMap.containsKey(num + 1) ? mMap.get(num) + mMap.get(num + 1) : 0;

				finalSum = (posSum > negSum) ? posSum : (negSum > posSum) ? negSum : mMap.get(num);
				if (finalSum > sum)
					sum = finalSum;

			}
		}

		System.out.println(mMap);
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("enter n ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("enter " + n + " elements");
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int result = pickingNumbers2(a);
		System.out.println(result);
		in.close();
	}

}
