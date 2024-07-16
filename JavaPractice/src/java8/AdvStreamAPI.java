package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvStreamAPI {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Kiran", 30, "Male", "IT", 2019, 90000));
		list.add(new Employee(2, "Raghav", 25, "Male", "Mechanical", 2020, 800000));
		list.add(new Employee(3, "Radhika", 30, "Female", "Electric", 2000, 20000));
		list.add(new Employee(4, "Dnyaneshwari", 27, "Female", "IT", 2023, 10000));
		
		
		list.stream().forEach(emp-> System.out.println(emp.getId()));

		Map<String, Long> deptMap = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		
		Stream<Employee> empLst=list.stream().filter(i->i.getGender().equalsIgnoreCase("Male"));
		
		//empLst.forEach(System.out.println());
		
		
		Stream<Integer> num= Stream.of(1,2,3,4);
		num.forEach(System.out::print);
		//System.out.println("num:: "+num.forEach(System.out::print));
		
		deptMap.forEach((k,v)->System.out.println(k+" "+v));
		
//		Map<String, List<Employee>> deptMapList= list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		
//		System.out.println("deptMapList:: "+deptMapList);
//		
//		
//		System.out.println("deptMap:: "+deptMap);
//
//		Map<String, Double> genderMap = list.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//
//		System.out.println("genderMap:: "+genderMap);
//
//		
//		Comparable c1=new Comparable<Double>() {
//			@Override
//			public int compareTo(Double o) {
//				return this.compareTo(o);
//			}
//		};
//	
//		
//		//c1.compareTo(list.stream().map(Product::getPrice));
//		
//		Employee maxSalaryEmp = list.stream()
//				.collect(Collectors.maxBy(
//						(m1, m2) -> m1.getSalary() > m2.getSalary() ? 1 : m1.getSalary() == m2.getSalary() ? 0 : -1))
//				.get();
//		System.out.println("maxSalaryEmp:: " + maxSalaryEmp);
//
//		Optional<Employee> seniorEmp = list.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
//				.findFirst();
//
//		System.out.println("seniorEmp:: " + seniorEmp);
//
//		System.out.println("reduce:: " + list.stream().map(Employee::getAge).reduce(0, (a, b) -> a + b));
//		
//		
//		Map<Boolean, List<Employee>> empPartition= list.stream().collect(Collectors.partitioningBy(e->e.getSalary()>10000));
//		System.out.println("empPartition:: "+empPartition);
		
		
		
	}

}

class Employee {
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
}
