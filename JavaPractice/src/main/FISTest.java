package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FISTest {

	public int add(int a, int b) {
		return a + b;
	}

	public double add(Integer a, int b) {
		return a + b;
	}
		
	public static void main(String[] args) {
		
		FISTest t=new FISTest();
		t.add(10, 20);

		List<List<Employee>> list = new ArrayList<>();
		List<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee(10, 1000);
		Employee e2 = new Employee(20, 2000);
		Employee e3 = new Employee(30, 3000);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		list.add(empList);

		Optional<Employee> maxEmpSal = list.stream().flatMap(i -> i.stream())
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		System.out.println("Max Salary::" + maxEmpSal.get().getSalary());
		secondHighest("KiranKawade");
	}

	public static void secondHighest(String input) {

		char[] chars = input.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < chars.length; i++) {

			if (map.containsKey(chars[i])) {
				map.put(chars[i], map.get(chars[i]) + 1);
			} else {
				map.put(chars[i], 1);
			}
		}
		System.out.println(map);
		
	    //Set<Entry<Character, Integer>> entrySet= map.entrySet();
	    int max=0;
	    int max2=0;
	    for(Entry<Character, Integer> entrySet: map.entrySet()) {
	    	int val= entrySet.getValue();
//	    	if(val> max) {
//	    		max= val;
//	    	}
//	    	if(max2 < max) {
//				max2 = max;
//    		}
	    	 if(val > max2 && val < max) {
	             max2 = val;
	         }
	    }
	    System.out.println("max found:: "+max);
	    System.out.println("secing highest max found:: "+max2);
		
	}

}

class Employee {
	int id;
	double salary;

	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
