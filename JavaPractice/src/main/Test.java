package main;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static List<Integer> rotateArray(ArrayList<Integer> arr, 
		    int k) {
		//List<Integer> list=new ArrayList<>(arr);
			int n=arr.size();
		        rotate(arr, 0, n-k);
		        rotate(arr, n-k, n-1);
		        rotate(arr, 0, n-1);
		        
		        return arr;
		    }

		    public static void rotate(ArrayList<Integer> arr,int left, int right) {

		        while(left<=right) {
		            int temp=arr.get(left);
		            arr.set(left, arr.get(right));
		            arr.set(right, temp);
		            left++;
		            right++;
		        }
		    }

	public static void main(String[] args) {
		
		
		
		
		//Collections.addAll(list, arr);
		
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
