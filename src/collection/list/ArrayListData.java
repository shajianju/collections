package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListData {

	public static void main(String [] arg) {

		ArrayList< String > list=new ArrayList<String>();
		list.add("A");

		list.add("B");list.add("C");

		System.out.println(list);

		try {
			list.add(10, "D");
		}
		catch (Exception e) {
			list.add("D");
		}

		list.remove(String.valueOf("A"));
		list.remove(0);
		ArrayList<String> gg= (ArrayList<String>) list.clone();
		gg.add("Hellooo");
		gg.clear();
		gg.add("232");
		gg.add("565");
		gg.add("4566");
		gg.set(1, "100000");
		System.out.println(gg.contains("10000"));
		System.out.println(list);
		System.out.println(gg);
		
		/* List<ArrayList<String>> ars= */
		Stream.of(gg).forEach(i->System.out.println("i==="+i));;
	
	
	
		
		for(String str: gg) {
			System.out.println(str);
		}
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}



}
