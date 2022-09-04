package day20.collections;

import java.util.ArrayList;

public class ArrayListExample3 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		ArrayList<Boolean> l2 =new ArrayList<Boolean>();
		l2.add(true);
		ArrayList<Character> l3=new ArrayList<Character>();
		l3.add('a');
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Ajay");
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Anuj");
		a1.add("Gaurav");
		System.out.println("An initial list of element :"+a1);
		//removing specific element from arraylist
		System.out.println("Remove Vijay from arraylist "+a1.remove("Vijay"));
		System.out.println("After invoking remove(Object) method:"+a1);
		//removing elements on specific position
		System.out.println("remove index 0 from collection :"+a1.remove(0));
		System.out.println("After invoking remove(index) method :"+a1);
		ArrayList<String> a12 =new ArrayList<String>();
		a12.add("Ravi");
		a12.add("Hanumat");
		//adding new elements to arraylist 
		a1.addAll(a12);
		System.out.println("Updated List :"+a1);
		//removing all the elements from arrayList 
		a1.remove(a12);
		System.out.println("after invoing removeAll() method :"+a1);
		//removing elements on basis of removeAll() Method
		if(a1.contains("Ajay")) {
			a1.remove("Ajay");
		}
		System.out.println("After invoking removeIf() method :"+a1);
		a1.clear();
		System.out.println("After invoking clear() method : "+a1);
		}
	}


