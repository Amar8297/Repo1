package Practise;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class TestCollection {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Karan");
		queue.add("Jay");
		queue.add("Ajay");
		queue.add("Vipul");
		System.out.println("Head of queue:"+queue.element());
		System.out.println("Head:"+queue.peek());
		System.out.println("iterating queue elements :");
		Iterator<String> itr=queue.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements :");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
