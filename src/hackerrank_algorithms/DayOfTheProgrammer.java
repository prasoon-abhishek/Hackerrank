package hackerrank_algorithms;

import java.util.Scanner;

public class DayOfTheProgrammer {

	public static void main(String[] args) {
		System.out.println("enter the year: ");
		  Scanner in = new Scanner(System.in);
	        int year = in.nextInt();
	        String result = solve(year);
	        System.out.println(result);
	       
	}

	private static String solve(int year) {
		int firstEightMonthToatl;
		if(year>1919){
			if(year%4==0){
				firstEightMonthToatl=215+29;
			}else{
				firstEightMonthToatl=215+28;
			}
				
		}
		else{
			if((year%4==0 && year%4!=0)|| year%400==0 ){
				firstEightMonthToatl=215+29;
			}
			else{
				firstEightMonthToatl=215+28;
			}
		}
		int daysLeft=256-firstEightMonthToatl;
		String dayOfProgrammer=daysLeft+".09."+year;
		return dayOfProgrammer;
	}

}
