package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class CatsAndAMouse {
	public static void main(String[] args) {
		System.out.println("enter x , y ,z ");
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int catACount = 0;
		int catBCount = 0;
		for (int a0 = 0; a0 < q; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			catACount = Math.abs(z - x);
			catBCount = Math.abs(z - y);
			String ans = (catACount < catBCount) ? "Cat A" : (catBCount < catACount) ? "Cat B" : "Mouse C";
			System.out.println(ans);
			// if (catACount < catBCount)
			// System.out.println("Cat A");
			// else if (catBCount < catACount)
			// System.out.println("Cat B");
			// else
			// System.out.println("Mouse C");
		}

	}
}
