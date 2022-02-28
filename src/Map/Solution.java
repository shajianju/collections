package Map;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;
/*
 * Create the Student and Priorities classes here.
 */

class Student  implements Comparable<Student>{

	int id;
	String name;
	double cgpa;
	Student(int id, String name, double cgpa){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	int getID(){
		return id;
	} 
	String getName(){
		return name;
	} 
	double getCGPA() 
	{
		return cgpa;
	}
	@Override
	public int compareTo(Student o) {

		if(getCGPA()==o.getCGPA()) {
			if(getID()==o.getID()) {
				return name.compareTo(getName());
			}
			else {
				if(getID()>o.getID())
					return -1;
				else if (getID()<o.getID())
					return 1;
				else
					return 0;
			}
		}
		else if(getCGPA()>o.getCGPA())
			return -1;
		else if(getCGPA()<o.getCGPA())
			return 1;
		return 0;
	}


}

class Priorities  {
	List<Student> getStudents(List<String> events){

		List<Student>list=new ArrayList<>();
		PriorityQueue<Student> st=new PriorityQueue<Student>();

		for(String str:events){ 
			if(!str.equals("SERVED")){
				String[] stu=str.split("\\s");
				st.add(new Student(Integer.parseInt(stu[1]), stu[2], Double.parseDouble(stu[3])));

			}
			else {

				st.poll();
			}

		}
		
		while(st.size()>1) {
			System.out.println(st.poll().getName());
			
		}


		return list;

	}
}



public class Solution {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());    
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st: students) {
				System.out.println(st.getName());
			}
		}
	}
}
