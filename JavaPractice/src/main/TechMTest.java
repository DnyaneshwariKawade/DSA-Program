package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TechMTest {
	
	
	public static void print(Integer i) {
		
	}
	
	public static void print(String i) {
		
	}

	public static void main(String[] args) {
		Student stud1=new Student(10, "Kiran", Arrays.asList(10,20,50));
		Student stud2=new Student(11, "Rahul", Arrays.asList(50,70));
		Student stud3=new Student(12, "manoj", Arrays.asList(70,20,30));
		
		List<Student> list=new ArrayList<>();
		list.add(stud1);
		list.add(stud2);
		list.add(stud3);
		
		//count of marks greather 3;
		//avg of marks grether 50
		// data sorted based on student name
		
		
		List<Student> sortedList= list.stream()
							.sorted((i1,i2)-> i1.getName().compareTo(i2.getName()))
							.collect(Collectors.toList());
		
		System.out.println(sortedList);
		
//		list.stream()
//		.filter(i->i.getMarks().size()>3)
		
		
	}

}

class Student {
	
	private int id;
	private String name;
	private List<Integer> marks;
	
	public Student(int id, String name, List<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
