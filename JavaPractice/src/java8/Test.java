package java8;

import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss = "Pawan kavita kiyansh Patidar Patidar";
	    StringBuilder ress = new StringBuilder();
	    
	    Map<Character, Integer> fre = ss.chars().boxed()
	            .collect(Collectors.toMap(k->Character.valueOf((char) k.intValue()),k->1,Integer::sum));
	    
		int n = 7;
		int k = 100;
		k = k % n;
		System.out.println(k);
	    

	}

}
