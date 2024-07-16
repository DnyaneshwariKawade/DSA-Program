package arrays;

import java.util.Arrays;

public class SecondMaxMin {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 7, 7, 5};
		//Arrays.sort(arr);
		int max=0;
		int second_max=0;
		for(int i=0;i<arr.length;i++) {
			
			if(max< arr[i]) {
				second_max = max;
				max= arr[i];
			} else if(second_max < arr[i] && max!=arr[i]) {
				second_max = arr[i];
			}
			
		}
		System.out.println(max);
		System.out.println(second_max);
	}

}
