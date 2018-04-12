package hackerrank.datastructure.linkedlist;


import java.util.ArrayList;
import java.util.LinkedList;;

public class PrintElements {

	static LinkedList<Integer> listLinked=new LinkedList<>();
	static ArrayList<Integer> listArray=new ArrayList<>();
	
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			listLinked.add(i);
			listArray.add(i+1);
		}
		listLinked.addAll(listArray);
		System.out.println(listLinked);
		System.out.println(listArray);
	}
}
