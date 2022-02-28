package collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueData {

	public static void main(String[] args) {
		
		Queue<String> pq=new PriorityQueue<>(Comparator.reverseOrder());	
		
		pq.offer("bbbbbbb");
		
		pq.offer("ggggg");
		
		pq.offer("absss");
		
		pq.offer("cccccccccc");
		
		pq.offer("bcccc");
		
		
		System.out.println(pq);
		
		//Created a min heap=>
		
		pq.poll();
		
		System.out.println(pq);
		
		
		System.out.println(pq.peek());
	}

}
