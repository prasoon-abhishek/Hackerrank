package hackererank.java.introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
	
	static{
		System.out.println("enter l and b");
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int b=scan.nextInt();
		
		try{
			if(l<=0 || b<=0){
				throw new Exception("Breadth and height must be positive");
			}
			else
				System.out.println(l*b);
		}catch(Exception e){
			System.out.println(e);
			
		}
	}
	public static void main(String[] args) {
		//System.out.println("enetr");
	}

}
