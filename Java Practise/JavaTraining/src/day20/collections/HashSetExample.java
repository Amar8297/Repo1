package day20.collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		System.out.println("After invoking remove(Object) method :"+set);
		System.out.println("Set size:"+set.size());
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Removing Ravi from set:"+set.remove("Ravi"));
		System.out.println("After invoking remove(object) method: "+set);
		HashSet<String> set1=new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		System.out.println("set1 elements :"+set1);
		set.addAll(set1);
		System.out.println("updated list :"+set);
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method:"+set);
		set.removeIf(str->str.contains("Vijay"));
		System.out.println("After invoking removeIf() method :"+set);
		set.clear();
		System.out.println("After invoking clear() method: "+set);
	}
}
