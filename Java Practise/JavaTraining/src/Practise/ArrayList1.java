package Practise;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList1 {
	public static void main(String[] agrs) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Banana");
		list.add("Grapes");
		list.add("Apple");
		list.add("Mango");
	/*	System.out.println("returning element :"+list.get(1));
		list.set(1, "oranges");
		System.out.print("Changing element at index 1"+list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**********************************");
		list.forEach(n->System.out.println(n));
		System.out.println("**************************");
		list.forEach(System.out::println);
		System.out.println("**************************");
		for(String i:list)
			System.out.println(list);*/
		Collections.sort(list);
		for(String fruit:list) 
			System.out.println(fruit);
			System.out.println("Sorting Number: ");
		ArrayList<Integer> list1=new ArrayList<Integer>();
			list1.add(110);
			list1.add(100);
			list1.add(10);
			list1.add(20);
			list1.add(30);
			list1.add(40);
			list1.add(50);
			list1.add(80);
		Collections.sort(list1);
		System.out.println("list1.indexOf(20) " +list1.indexOf(20));
		System.out.println(list1.contains(50));
		System.out.println(list1.contains(70));
		System.out.println("list1.lastIndexOf(100): "+list1.lastIndexOf(100));
		System.out.println(list1.remove(6));
		for(int num:list1)
			System.out.println(num);
}

	}


