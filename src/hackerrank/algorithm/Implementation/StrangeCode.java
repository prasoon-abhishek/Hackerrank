package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class StrangeCode {

	static long strangeCode(long t) {
		// Complete this function
		long timeStart = 0;
		long valueStart = 4;
		long fValueStart = 3;

		while (timeStart != t) {
			if (valueStart == 1) {
				valueStart = (fValueStart * 2) + 1;
				fValueStart = valueStart - 1;
			}

			timeStart++;
			valueStart--;
		}
		return valueStart;
	}

	static long strangeCode1(long t) {
		long startValue = 3;
		while (t > startValue) {
			t = t - startValue;
			startValue *= 2;
		}
		return (startValue - t + 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter t");
		long t = in.nextLong();
		long result = strangeCode(t);
		System.out.println(result);
		in.close();
	}

}
