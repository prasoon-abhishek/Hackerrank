package hackerrank.java.data_structures;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackHC {

	public static void main(String[] args) {
		System.out.println("enter : ");
		Scanner sc = new Scanner(System.in);

		Stack<String> stackSample = new Stack<>();

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			if (stackSample.peek().matches("{"))
				stackSample.pop();
			else
				stackSample.push(input);
			try {
				System.out.println(stackSample);
			} catch (EmptyStackException e) {
				System.out.println("empty");
			}

		}

	}

}
