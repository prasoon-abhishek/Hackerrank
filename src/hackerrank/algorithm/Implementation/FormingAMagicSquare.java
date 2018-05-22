package hackerrank.algorithm.Implementation;

import java.util.Scanner;

public class FormingAMagicSquare {

	static int formingMagicSquare(int[][] s) {
		int cost=0;
		for(int i=0;i<3;i++){
			int rowSum=0;
			for(int j=0;j<3;j++){
				rowSum+=s[i][j];
			}
			cost+=Math.abs(15-rowSum);
		}
		return cost;
    }

    public static void main(String[] args) {
    	System.out.println();
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}

