package com.collections;
import java.util.PriorityQueue;
//Class Declaration
public class DemoPriorityQueue {
	public static void main(String[] args) {
		//Initializing objects for PriorityQueue
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		//Adding elements to the Queue
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		//printing queue elements
		System.out.println(pq);	
		//printing top elements from the queue
		System.out.println(pq.peek());	
		//deleting element from the queue
		System.out.println(pq.poll());	
		//printing queue elements
		System.out.println(pq);
     }
}
