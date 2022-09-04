package day20.collections;

import java.util.Vector;

public class VectorExample2 {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		System.out.println("Elements are:"+vec.capacity());
		vec.add("TIger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		vec.add("TIger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		System.out.println("Elements are: "+vec);
		vec.addElement("mat");
		System.out.println("ELements are: "+vec.capacity());
		System.out.println("Elements are: "+vec);
		for(String str:vec) {
			System.out.println(vec);
		}
	}
}
