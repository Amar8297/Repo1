package day20.collections;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		System.out.println("Intial List of elements :"+a);
		System.out.println("List of Elements status: "+a.isEmpty());
		a.add("Ravi" );
		a.add("Vijay");
		a.add("Ajay");
		System.out.println("After invoking add(E e) method:"+a);
		a.add(1,"Gaurav");
		System.out.println("After Invoking add(int index,E Element )method: "+a);
		ArrayList a2 =new ArrayList();
		a2.add("Sonno ");
		a2.add("Hanumat ");
		System.out.println("List of a2 element :"+a2);
		System.out.println("a element before adding of a2 "+a);
		a.addAll(a2);
		System.out.println("List of elements after adding a2 element :"+a);
		ArrayList a3=new ArrayList();
		a3.add("John");
		a3.add("Rahul");
		System.out.println("List of a2:"+a2);
		System.out.println("List of a3:"+a3);
		a2.addAll(1,a3);
		System.out.println("After adding a3 into a2 :"+a2);
	}

}
