package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class HalloweenSale {

	static int howManyGames(int p, int d, int m, int s) {
		// Return the number of games you can buy
		int count = 0;
		while (s >= p) {
			s -= p;
			p -= d;

			if (p <= m)
				p = m;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter p d m s");
		int p = in.nextInt();
		int d = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		int answer = howManyGames(p, d, m, s);
		System.out.println(answer);
		in.close();
	}
}
