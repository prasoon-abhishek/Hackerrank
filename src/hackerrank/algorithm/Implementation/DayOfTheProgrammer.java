package hackerrank.algorithm.Implementation;

import java.util.Scanner;

//215
public class DayOfTheProgrammer {

	static String solve(int year) {
		if(year<1918){
			if(year%4==0)
				return "12.09."+year;
		}
		else if(year==1918)
			return "26.09.1918";
		else {
			if(isLeapYear(year))
			return "12.09."+year;
		}
		
		return "13.09."+year;
	}

	static boolean isLeapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0)
				return true;
		} else if (year % 4 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}

}
