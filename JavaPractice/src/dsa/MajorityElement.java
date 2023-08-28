package dsa;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	public static int solution(int[] arr) {
		//
		
		int n=arr.length;
		Map<Integer, Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(i)+1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		
		return -1;
	}

	public static void main(String[] args) {
		solution(new int[] {2,2,6,6,6,2,2,8,2,2});
	}

}
