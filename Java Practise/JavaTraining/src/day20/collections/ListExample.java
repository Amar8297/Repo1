package day20.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String args) {
		ArrayList a1=new ArrayList();
		List l1=new ArrayList();
		String s1=new String("Demo");
		Object obj=s1;
		Object obj1=(Object)s1;
		a1.add("Pune");
		a1.add(123);
		a1.add(true);
		a1.add(null);
		a1.add("Pune");
		System.out.println("Size of list :"+a1.size());
		System.out.println("Elements of list :"+a1);
		System.out.println("Index specific elements :"+a1.get(2));
		for(int i=0;i<a1.size();i++) {
			System.out.println("Element at index : "+i+" "+a1.get(i));
			
		}for(object obj:a1) {
			System.out.println(obj);
		}
	}
}
