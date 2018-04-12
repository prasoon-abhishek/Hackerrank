package hackerrank.algorithm.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

	static void extraLongFactorials(int n) {
		// Complete this function
		BigInteger factorial = new BigInteger("1");
		while (n > 1) {
			factorial = factorial.multiply(BigInteger.valueOf(n));
			n--;
		}
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		System.out.println("enter a num");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		extraLongFactorials(n);
		in.close();
	}

}
