package Practise;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<>();
		l1.add("Ravi");
		l1.add("Vijay");
		l1.add("Priyanka");
		l1.add("Pooja");
		//Traversing the list of elements in reverse order  
	   Iterator itr=l1.descendingIterator();
	   /*for(String i:l1)
		   System.out.println(i);*/
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	}
}
