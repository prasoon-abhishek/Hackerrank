package strings;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Scanner;

public class DateTime {

	public static LocalDate getDayOfWeek() {
		System.out.println("enter ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		// System.out.println(date.getYear()+" "+date.getMonth());
		return date;
	}

	public static void main(String[] args) {
		System.out.println(getDayOfWeek().getDayOfWeek());

	}
}
