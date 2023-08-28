package main;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

//	    List<Integer> list=Arrays.asList(1,1,2,3,1,1,2,2);
//	    
//	    
//	    int sum= list.stream().reduce(0, (a,b)->a+b);
//	    
//	    Map<Integer, Integer> map=new HashMap<>();
//	  //  map.put(1, 2);
//	    
//	    
//	   // System.out.println(map.get(1));
//	    
//	    for(int i=0;i<list.size();i++) {
//	    	
//	    	if(map.containsKey(list.get(i))) {
//	    		map.put(list.get(i), map.get(list.get(i))+1);
//	    		
//	    		if(map.get(list.get(i))>2) {
//	    			System.out.println(list.get(i));
//	    		}
//	    		
//	    	} else {
//	    		map.put(list.get(i), 1);
//	    	}
//	    	
//	    }
		Integer a = 10;
		Integer b = 20;
		swap(a, b);
		System.out.println(a + " " + b);
		String s2 = new String("Hello");
		
		System.out.println(s2);
		List<String> list=new ArrayList<String>();
		list.add("Raghav");
		swap(s2, list);
		System.out.println(list);
	}

	static void swap(String s2, List<String> list) {
		s2 = s2+ "World";
		list.add("Radhika");
	}

	static void swap(Integer a, Integer b) {
//		Integer temp = a;
//		b = a;
//		a = temp;
		a = 20;
		b = 30;
	}

}
