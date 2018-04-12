package hackerrank.java.data_structures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Dequeue {

	public static void main(String[] args) {
		System.out.println("Enter no of elements");
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> aList = new ArrayList<>();
		int n = in.nextInt();
		System.out.println("enter size of subarray");
		int m = in.nextInt();
		System.out.println("enter " + n + " numbers");

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			aList.add(num);
			if (deque.size() == m + 1) {
				int first = deque.removeFirst();

			}

			System.out.println(deque);
//			System.out.println(count);
		}
		in.close();

	}
}
