package test.thread;

public class YashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Emaployee e1=new Emaployee(10, 10000,"Kiran");
//		Emaployee e2=new Emaployee(11, 20000,"Poj");
//		Emaployee e3=new Emaployee(12, 5000,"Kiran");
//		
//		
//		List<Emaployee> list=new ArrayList<>();
//		list.stream().collect(Collectors.partitioningBy(null))
		
		
		
	}

}

class Emaployee {
	private int id;
	private double salary;
	private String name;
	
	
	public Emaployee(int id, double salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
