package hackerrank.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter x and y:");
		Scanner scan = new Scanner(System.in);

		try {
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}

	}

}
