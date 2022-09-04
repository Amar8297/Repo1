package day20.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample2 {
	public static void main(String[] args) {
		Queue queue=new PriorityQueue();
		System.out.println("Size :"+queue.size());
		System.out.println("Queue of elements "+queue);
		System.out.println("head element of the queue using element():"+queue.element());
		System.out.println("head element of the queue using peek():"+queue.peek());
	}
}
