package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapData {

	public static void main(String[] args) {

		Map<String , Integer>list=new HashMap<String, Integer>();
		list.put("one", 1);
		list.put("two", 2);
		list.put("three", 3);
		list.put("four", 4);
		list.putIfAbsent("two", 26);
		
		
		for(String ll:list.keySet()) {
			System.out.println(ll);
		}
		
		list.containsValue(Integer.valueOf(1));
		
		for(Integer l:list.values()) {
			System.out.println(l);
		}
		
	}

}
