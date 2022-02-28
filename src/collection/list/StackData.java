package collection.list;

import java.util.Stack;

public class StackData {

	public static void main(String[] args) {
		
		
		Stack<String> list=new Stack<>();
		list.push("ABC");
		list.push("hjsdhjsk");
		list.push("67868");
		list.push("xdns5");
		list.push("xdns5");
		list.push("xdns5");
		list.push("xdns5");
		list.push("xdns5");
		list.push("xdns5");
		
		System.out.println(list);
		
		System.out.println(list.peek()); 
		
		//list.pop();
		System.out.println(list);
		//list.clear();
		System.out.println(list);
		
	}

}
