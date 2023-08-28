package dsa;

import java.util.HashMap;
import java.util.Map;

public class FindIndices {

	public static void main(String[] args) {
		
		int[] arr=new int[] {11,3,7,9,14,2};
		int[] ans=new int[2];
		int target =17;
		
		Map<Integer, Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int sno=target-arr[i];
			
			if(map.containsKey(sno)) {
				ans[0]= map.get(sno);
				ans[1]=i;
			}
			map.put(arr[i], i);
		}
		System.out.println(ans[0]+"==="+ans[1]);
	}
}


