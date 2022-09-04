package day20.collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		System.out.println("Initial List of elements:"+l1);
		l1.add("Ravi");
		l1.add("Ajay");
		l1.add("Vijay");
		System.out.println("After invoking add(Ee) method: "+l1);
		l1.add(1,"Gaurav");
		System.out.println("After invoking add(int index, E element) method: "+l1);
		LinkedList<String> l12=new LinkedList<String>();
		l12.add("Sonoo");
		l12.add("Hanumat");
		l1.addAll(l12);
		System.out.println("After invoking addAll(Collection<? extends E> c) method:"+l1);
		LinkedList<String> l13=new LinkedList<String>();
		l13.add("Rahul");
		l13.add("John");
		l1.addAll(l13);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + l1);
		l1.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e) method: " + l1);
		l1.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: " + l1);
	}

}
