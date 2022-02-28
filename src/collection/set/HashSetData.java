package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetData {

	public static void main(String[] args) {

		
		//Has only unique elements
		
		Set<Integer> set=new HashSet<>();
		
		//unique hasvalue will be crated 
		
		set.add(456);
		set.add(5656);
		set.add(456);
		set.stream().forEach(i->System.out.println(i));
		
		set.remove(456);
		
		
		set.add(456);
		set.stream().forEach(i->System.out.println(i));
		
		System.out.println(set.contains(456));
		
	}

}
