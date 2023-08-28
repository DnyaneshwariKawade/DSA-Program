package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FindSecondHighest {

	public static void main(String[] args) {
		
		int array[]=new int[] {1,2,3,4,5};
		int max=0;
		int max2 = 0;
		for(int i = 0; i < array.length; i++) {
		    if(array[i] > max2 && array[i] < max) {
		         max2 = array[i];
		     }
		}
		System.out.println(max2);
		
		System.out.println(get2ndMostFrequent("KiranKKi"));
	}
	
	public static String get2ndMostFrequent(String str) {
		
		return Arrays.stream(str.split("")) // Stream<String> chars
		        .collect(Collectors.groupingBy(
		                s -> s, Collectors.summingInt(i->1)
		            ))
		        .entrySet()
		        .stream()
		        .collect(Collectors.toMap(Map.Entry::getValue, 
		        		Map.Entry::getKey,
		        		(s1,s2)->s1+s2,
		        		()->new TreeMap<Integer, String>(Comparator.reverseOrder()))).values().stream().skip(1).findFirst().orElse(null);
//		System.out.println(map);
//		Integer  sum=Arrays.asList(1,2,3,4,5).stream().collect(Collectors.summingInt(i->i++));
//		System.out.println(sum);
//		return null;
	}

}
