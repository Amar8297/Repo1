package day20.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("List of elements :"+list);
		HashSet<String> set=new HashSet<String>();
		System.out.println("Initial sets of elements :"+set);
		set.add("Gaurav");
		System.out.println("Set of elements :"+set);
		Iterator<String> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("******************");
		set.forEach(s1->{
			System.out.println(s1);
		
	});
		System.out.println("*********************");
		set.removeIf(s1->s1.contains("Ravi"));
		list.removeIf();
		System.out.println("set of elements :"+set);
 	} 
}