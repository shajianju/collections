package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashData {

	public static void main(String[] args) {
		
		Set<Integer>jj =new  TreeSet();
		
		
		jj.add(566);
		
		jj.add(25);
		
		jj.add(5656);
		
		jj.stream().forEach(i->System.out.println(i));
		
		///Tree set will print the data in ordered format

	}

}
