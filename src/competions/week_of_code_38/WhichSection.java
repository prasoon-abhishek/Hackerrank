package competions.week_of_code_38;

import java.util.Scanner;

public class WhichSection {
	
	private static int whichSection(int n, int k, int[] a) {
		int elements=1;
		int index=1;
		for(int i=0;i<a.length;i++){
//			System.out.println(elements +" "+(elements+a[i]-1));
			if(k>=elements && k<=elements+a[i]-1){
				index=i+1;
				break;
			}
				
				elements+=a[i];
		}
		return index;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int m=scan.nextInt();
		int[] arr=new int[m];
		for(int i=0;i<m;i++){
			arr[i]=scan.nextInt();
		}
		int result=whichSection(n,k,arr);
		System.out.println(result);
	}

	
}
