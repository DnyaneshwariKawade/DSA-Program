package arrays;

import java.util.Arrays;

public class MoveAllZeroToRight {

	public static void main(String[] args) {

		//int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 0, 1 };
		int[] arr = new int[] {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
		int[] temp = new int[arr.length];
		
		int index=0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				temp[index++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		//solution();
	}

}
