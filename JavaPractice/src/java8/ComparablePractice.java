package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparablePractice {

	public static void main(String[] args) {
		
		Emp e1=new Emp(10, "Kiran", 1000d);
		Emp e2=new Emp(11, "Raghav", 2000d);
		Emp e3=new Emp(12, "Dnyaneshwari", 3000d);
		List<Emp> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		
		list.sort((i1, i2) -> i1.getId() > i2.getId() ? 1 : i1.getId() == i2.getId() ? 0 : -1);
		
		list.stream().forEach(i->System.out.println(i.getId()+" "+i.getName()+" "+i.getSalary()));
		
	}
}

class Emp {
	private int id;
	private String name;
	private double salary;
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
