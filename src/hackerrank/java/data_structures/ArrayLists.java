package hackerrank.java.data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		System.out.println("Enter no of rows :");
		Scanner in = new Scanner(System.in);
		int numOfRows = in.nextInt();
		HashMap<Integer, ArrayList<Integer>> mapList = new HashMap<>();

		for (int i = 1; i <= numOfRows; i++) {
			System.out.println("enter no of elements in row: " + i);
			ArrayList<Integer> listRows = new ArrayList<>();
			int numOfelements = in.nextInt();
			listRows.add(numOfelements);
			System.out.println("enter " + numOfelements + " elements");
			for (int j = 0; j < numOfelements; j++) {
				int element = in.nextInt();
				listRows.add(element);
			}
			mapList.put(i, listRows);
		}

		System.out.println("enter num of queries");
		int numOfQuery = in.nextInt();
		for (int i = 1; i <= numOfQuery; i++) {
			System.out.println(i + "st query");
			int x = in.nextInt();
			int y = in.nextInt();
			try {
				System.out.println(mapList.get(x).get(y));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Error");
			}
		}
		in.close();

	}

}
