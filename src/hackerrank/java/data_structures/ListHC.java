package hackerrank.java.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListHC {

	public static void main(String[] args) {
		System.out.println("Enter no. of elements in list :");
		Scanner scan = new Scanner(System.in);
		int numOfElements = scan.nextInt();
		System.out.println("enter " + numOfElements + " numbers");
		List<Integer> queryList = new ArrayList<>();
		for (int i = 0; i < numOfElements; i++) {
			queryList.add(scan.nextInt());
		}
		System.out.println("Enter num of query: ");
		int numOfQuery = scan.nextInt();
		System.out.println("enter " + numOfQuery + " queries");
		for (int i = 0; i < numOfQuery; i++) {
			switch (scan.next()) {
			case "Insert":
				int x = scan.nextInt();
				int y = scan.nextInt();
				queryList.add(x, y);
				break;
			case "Delete":
				int z = scan.nextInt();
				queryList.remove(z);
				break;

			}
		}
		scan.close();
		// System.out.println(queryList);
		for (Integer i : queryList) {
			System.out.print(i + " ");
		}
	}

}
