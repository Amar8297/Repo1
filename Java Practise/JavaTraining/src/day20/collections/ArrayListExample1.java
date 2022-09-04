package day20.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample1 {
	public static void main(String args[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("123");
		System.out.println("size of list :"+list.size());
		System.out.println("Elements of list :"+list);
		System.out.println("Traversing through forEach() method:");
		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Traversing list through Iterator Interface ");
		Iterator<String> itr=list.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("***************with used iterator Object******************");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("*********With new Iterator Object************");
			Iterator<String> itr2=list.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			
		}
		}
	}

