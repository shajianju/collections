package collection.queue;

import java.util.ArrayDeque;

public class DequeueData {

	public static void main(String[] args) {

		ArrayDeque<String>  ad=new ArrayDeque<>();
		ad.offer("random");
		ad.offerFirst("First Element");
		ad.offerLast("Last Element");
		
		ad.offerLast("Again Last Element");
		
		
		
		
		ad.stream().forEach(i->System.out.println(i));
		
		System.out.println(ad.poll());
		
		System.out.println(ad.pollFirst());
		
		
		ad.stream().forEach(i->System.out.println(i));
		
	}

}
