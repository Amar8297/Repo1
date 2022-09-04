package day20.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue queue=new PriorityQueue();
		queue.add(121);
		queue.add(245);
		queue.add(10);
		queue.add(105);
		queue.add(50);
		queue.add(1);
		System.out.println("Size :"+queue.size());
		System.out.println("Elements of queue"+queue);
		System.out.println("Head element of queue using peek();"+queue.element());
		System.out.println("Iterating queue elements using for-each elements :");
		for(Object obj:queue) {
			System.out.println(obj);
		}
		System.out.println("Iterating queue elements using Iterator :");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Elements of the queue :"+queue);
		System.out.println("Removing elelments from the queue using remove() :"+queue.remove());
		System.out.println("Elements of the queue :"+queue);
		System.out.println("after removing two elements: ");
		Iterator itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("*************************");
		//using lamda expression
		queue.forEach(obj->{
			System.out.println(obj);
		});
	}
}
