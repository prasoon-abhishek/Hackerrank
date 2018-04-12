package hackerrank.exception_handling;

import java.util.Scanner;

public class ExceptionHandlingHR {

	private long power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} else if (n == 0 || p == 0) {
			throw new Exception("n and p should not be zero.");
		} else {
			return (int) Math.pow(n, p);
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingHR ehhr = new ExceptionHandlingHR();
		System.out.println("enter x and y");
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(ehhr.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		in.close();
	}

}
