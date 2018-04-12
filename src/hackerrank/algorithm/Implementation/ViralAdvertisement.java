package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class ViralAdvertisement {

	static int viralAdvertising(int n) {
		// Complete this function
		int men = 5;
		int total = 2;
		for (int i = 0; i < n - 1; i++) {
			men = (int) Math.floor(men / 2) * 3;
//			System.out.println("men " + men);
			total += (men / 2);
//			System.out.println("total " + total);
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = viralAdvertising(n);
		System.out.println(result);
		in.close();
	}
}
