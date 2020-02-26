package queueDataStructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
public static void main(String[] args) {
	Queue<String> q = new PriorityQueue<String>();
	q.add("user1");
	q.add("user2");
	q.add("user3");
	q.add("user4");
	//user1
	System.out.println("top element: " + q.peek());
	//user1
	System.out.println("removed element: " + q.poll());
	System.out.println("top element: " + q.peek());
	
	
	System.out.println("top element: " + q.peek());
	System.out.println("removed element: " + q.poll());
	System.out.println("top element: " + q.peek());
	
	System.out.println(q);
	
	
}
}
