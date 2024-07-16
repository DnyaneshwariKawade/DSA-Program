package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Consumer<Integer> c=i->System.out.print("test"+i);;
		c.accept(10);
		
		
		Function<Integer,Integer> f;
		
		Comparator<Integer> comp=(o1, o2) -> o1.compareTo(o2);

//		comp.thenComparingInt();
//		Main m=new Main();
//		if(Objects.requireNonNull(m)){
//
//		}


		//Stream<Integer> stream = null;//Arrays.asList(1, 2, 3, 4, 5);

		Stream<Integer> stream= Stream.of(1,2,3,4);
		
		
		//int sum = stream.sum();

		//System.out.println(sum); // 15
		
//		 int day = 2;
//		    String dayType;
//		    switch (day) {
//		      case 1, 2, 3, 4, 5 -> dayType = "Weekday";
//		      case 6, 7 -> dayType = "Weekend";
//		      default -> throw new IllegalStateException("Invalid day: " + day);
//		    }
//		    System.out.println(dayType);

//		List<List<Integer>> list= Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(10,20,30,40),Arrays.asList(1,2,3,4));
//		list.stream().flatMapToInt(num->num.stream());


		List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

		// Using Stream flatMapToInt(Function mapper)
		// to get length of all strings present in list
		list.stream().flatMapToInt(str -> IntStream.of(str.length())).forEach(System.out::println);


		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));

		// Flatten the list of lists into a single IntStream
		listOfLists.stream().flatMapToInt(list1 -> list1.stream().mapToInt(Integer::valueOf));
	}
}
