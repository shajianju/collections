package Map;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapData {

	public static void main(String[] args) {

		Map<Integer, Integer> list=new TreeMap<>();
		list.put(4, 56);
		list.put(1, 556);
		list.put(12, 546);

		for(Entry<Integer, Integer>	kk:list.entrySet()) {
			System.out.println(kk);
		}

		int[] a= {1,5,8,6};
		System.out.println(Arrays.binarySearch(a, 5));
		Arrays.sort(a);
		System.out.println(a);
		
	}

}
