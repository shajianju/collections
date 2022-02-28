package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueData {

	public static void main(String[] args) {

		Queue<String> queue=new LinkedList<>();
		queue.offer("AB");
		queue.offer("2wew");
		queue.offer("xs");
		queue.offer("A423B");
		queue.offer("AdcdB");
		System.out.println(queue);
		
		
	System.out.println(queue.peek());
	
	queue.poll();queue.poll();queue.poll();queue.poll();queue.poll();queue.poll();queue.poll();queue.poll();
	
	queue.add("njsnaj");
	//queue.remove();//Throws exception
	System.out.println(queue);
	
		
	}

}
