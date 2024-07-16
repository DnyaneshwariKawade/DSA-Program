package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class StreamAPI {
	

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> f = (x, y) -> {
			int sum = x + y;
			int avg = sum / 2;
			return avg;
		};
		f.apply(10, 10);

		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "HP Laptop", 10000d));
		list.add(new Product(2, "Dell Laptop", 80000d));
		list.add(new Product(3, "MAC Laptop", 50000d));

		
		double priceSum = list.stream().mapToDouble(p -> p.getPrice()).sum();
		System.out.println("priceSum:: " + priceSum);

		Product maxPrice = list.stream().max(Comparator.comparingDouble(Product::getPrice)).get();

		System.out.println("totalPrice:: " + maxPrice.getPrice());

		list.sort((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));
		System.out.println(list);

//		list.stream().sorted((o1, o2) -> o1.getPrice() > o2.getPrice() ? 1 : o1.getPrice() > o2.getPrice() ? -1 : 0);
//
//		if(list.stream().anyMatch(p->p.getPrice()>10000)) {
//			
//		}
//		
//		
//		double sumPrice = list.stream().collect(Collectors.summingDouble(p -> p.getPrice()));
//
//		
//		System.out.println(sumPrice);
//
//		Map<Double, List<Product>> map = list.stream().collect(Collectors.groupingBy(Product::getPrice));
//
//		System.out.println(map);
//
//		Product maxProduct = list.stream()
//				.max((m1, m2) -> m1.getPrice() > m2.getPrice() ? 1 : m1.getPrice() == m2.getPrice() ? 0 : -1).get();
//		System.out.println("maxProduct:: " + maxProduct);
//
//		Product minProduct = list.stream()
//				.min((m1, m2) -> m1.getPrice() > m2.getPrice() ? 1 : m1.getPrice() == m2.getPrice() ? 0 : -1).get();
//		System.out.println("minProduct:: " + minProduct);
//
//		double avgPrice = list.stream().collect(Collectors.averagingDouble(Product::getPrice));
//		System.out.println("avgPrice:: " + avgPrice);

	}
}

class Product {
	int id;
	String name;
	Double price;

	public Product(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
