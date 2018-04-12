package strings;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
	

	static void currency(double d) {
		Locale ind = new Locale("en", "IN");
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: "+us.format(d));
		NumberFormat indNF = NumberFormat.getCurrencyInstance(ind);
		System.out.println("India: "+indNF.format(d));
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: "+china.format(d));
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: "+france.format(d));
	}

	public static void main(String[] args) {
		System.out.println("enter amount");
		Scanner scan = new Scanner(System.in);
		double amount = scan.nextDouble();
		currency(amount);
	}
}
