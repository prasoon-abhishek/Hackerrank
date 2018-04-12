package hackerrank.java.data_structures;

import java.util.HashMap;
import java.util.Scanner;

public class MapHC {

	public static void main(String[] args) {
		System.out.println("Enter num of entries:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		HashMap<String, Integer> mapContacts = new HashMap<>();
		System.out.println("enter " + n + "contacts");
		for (int i = 0; i < n; i++) {

			String name = in.nextLine();
			in.nextLine();
			int phone = in.nextInt();
			mapContacts.put(name, phone);
			in.nextLine();
		}

		while (in.hasNext()) {
			String s = in.nextLine();
			if (mapContacts.containsKey(s))
				System.out.println(s + "=" + mapContacts.get(s));
			else
				System.out.println("Not found");
		}
	}

}
