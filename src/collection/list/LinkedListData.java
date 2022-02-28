package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListData {

	public static void main(String[] args) {
		
		
		List<String> linkedList=new LinkedList<>();
		
		linkedList.add("bhsxjhsxbjsxc");
		linkedList.add("4435345");
		linkedList.add("252785");
		
		linkedList.add("bhsxjhsxbjsxc");
		linkedList.add("bhsxjhsxbjsxc");
		linkedList.add("bhsxjhsxbjsxc");
		
		linkedList.add("252785");
		linkedList.add("252785");
		linkedList.add("252785");
		
		
		linkedList.stream().distinct().forEach(i->System.out.println(i));;
		

	}

}
