package test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp1 {

	public static void main(String[] args) {
		
		Emp e1=new Emp("Kiran",30,10000);
		Emp e2=new Emp("Ram",20,20000);
		Emp e3=new Emp("Sham",35,30000);
				
		List<Emp> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
	 	double sumSal= list.stream()
	 			.filter(emp->emp.getSalary()>10000)
	 			.collect(Collectors.summingDouble(Emp::getSalary));
	 	
	 	list.stream().filter(e->e.getSalary()>1000);	 	
	 	
//	 	list.stream()
//	 			.filter(emp->emp.getSalary()>10000)
//	 			.collect(Collectors.groupingBy(Collectors.summingDouble(Emp::getSalary)));
		
		//Map<String, Double> map=list.stream().collect(Collectors.groupingBy(Emp::getName, Collectors.averagingDouble(Emp::getSalary)));
		System.out.println(sumSal);
		
	}

}

class Emp {
	
	private String name;
	private int age;
	private double salary;
	
	
	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
