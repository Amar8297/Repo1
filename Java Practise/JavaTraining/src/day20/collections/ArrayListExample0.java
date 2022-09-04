package day20.collections;

import java.util.ArrayList;

public class ArrayListExample0 {
	public static void main(String args[]) {
		ArrayList<Object> list =new ArrayList<Object>();
		list.add("Mango");
		list.add(1235);
		list.add("Banana");
		list.add(null);
		list.add('c');
		list.add(15.26);
		list.add(true);
		list.add(new ArrayListExample0());
		list.add("Banana");
		System.out.println("Size of list :"+list.size());
		System.out.println("Elements of list :"+list);
		System.out.println("Transversing list through for loop");
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
		System.out.println("Tranversing list through for-loop: ");
		for(Object fruit:list) {
			System.out.println(fruit);
		}
		System.out.println("Returning element :"+list.get(1));
		list.set(1, "Dates ");
		System.out.println("Size of list :"+list.size());
		System.out.println("Elements of list "+list	);
		}

}
