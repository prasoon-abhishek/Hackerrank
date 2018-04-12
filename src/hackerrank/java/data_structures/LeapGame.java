package hackerrank.java.data_structures;

import java.util.Arrays;
import java.util.Scanner;

public class LeapGame {

//	public static boolean canWin(int leap, int[] game) {
//		int pos = 0, c=0;
//		if (leap >= game.length)
//			return true;
//		else {
//
//			if (game[leap - 1] == 0) {
//				pos = game[leap - 1];
//				c=leap-1;
//				for(int i=0;i<game.length-pos-1;i++){
//					game[i]=game[c];
//					c++;
//				}
//				canWin(leap, game);
//			} else if (game[pos + 1] == 0) {
//				pos = game[pos + 1];
//			}
//
//		}
//	}

	public static void main(String[] args) {
		System.out.println("Enter no. of queries:");
		Scanner scan = new Scanner(System.in);
		int query = scan.nextInt();
		while (query-- > 0) {
			System.out.println("enter no. of elements");
			int n = scan.nextInt();
			int[] game = new int[n];
			System.out.println("enter leap ");
			int l = scan.nextInt();
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}
		}
		
	}

}
