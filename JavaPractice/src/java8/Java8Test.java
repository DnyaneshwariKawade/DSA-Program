package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Test {

	public static void main(String[] args) {
		
		List<Empployee> list=new ArrayList<>();
		list.add(new Empployee(10, "Kiran", 10000, 2022, "Jan"));
		list.add(new Empployee(10, "Kiran", 20000, 2022, "Feb"));
		list.add(new Empployee(10, "Kiran", 40000, 2023, "Jan"));
		
		Map<Integer, List<Empployee>> result=list.stream().collect(Collectors.groupingBy(Empployee::getYear));
		
		
		result.entrySet().stream().forEach(null);
		
		
		
		System.out.println(result);
		
		
		
	}

}
class Empployee {
	int id;
	String name;
	double salary;
	int year;
	String month;
	
	public Empployee(int id, String name, double salary, int year, String month) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.year = year;
		this.month = month;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	@Override
	public String toString() {
		return "Empployee [id=" + id + ", name=" + name + ", salary=" + salary + ", year=" + year + ", month=" + month
				+ "]";
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
}