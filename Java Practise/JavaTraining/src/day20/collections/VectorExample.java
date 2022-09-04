package day20.collections;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		System.out.println("Elements are :"+vec);
		for(String str:vec) {
			System.out.println(str);
		}
	}
}
