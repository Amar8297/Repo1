package day20.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> a1=new TreeSet<String>();
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ravi");
		a1.add("Ajay");
		System.out.println("Treeset elements are :"+a1);
		//Transversing elements 
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing elements through iterator in decending order");
		Iterator i=a1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("TreeSet elements are :"+set);
		System.out.println("First element values :"+set.pollFirst());
		System.out.println("After pollFirst() treeSet elements are :"+set);
		System.out.println("LAst element values :"+set.pollLast());
		System.out.println("After pollLast() TreeSet elements are :"+set);
		
		TreeSet<String> set2=new TreeSet<String>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		System.out.println("Initial set :"+set2);
		
		System.out.println("Reverse Set: "+set2.descendingSet());
		System.out.println("Head set :"+set2.headSet("C"));
		System.out.println("Head set :"+set2.headSet("C",true));
		
		System.out.println("Subset: "+set2.subSet("A","E"));
		System.out.println("Subset:"+set2.subSet("A",false,"E",true));
		
		System.out.println("TailSet: "+set2.tailSet("C"));
		System.out.println("TailSet: "+set2.tailSet("C",false));
 	}
}
