package interview_prep_kit.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNotes {

	static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
	
		String[] magazine = new String[m];
		Map<String,Integer> map=new HashMap<>();
		String[] note = new String[n];
		for(int i=0;i<m;i++){
			magazine[i]=scan.next();
			if(map.get(magazine[i])!=null)
			map.put(magazine[i], map.get(magazine[i])+1);
			else
				map.put(magazine[i], 1);
		}
//		printArray(magazine);
//		System.out.println(map);
		String result="Yes";
		for(int i=0;i<n;i++){
			note[i]=scan.next();
			if(map.get(note[i])>0)
				map.put(note[i], map.get(note[i])-1);
			else{
				result="No";
				break;
			}
		}
		
	System.out.println(result);
		
	}
}
