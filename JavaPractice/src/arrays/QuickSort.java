package arrays;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] input, int startIndex, int endInedx) {
		if (startIndex < endInedx) {
			int partitionIndx = partition(input, startIndex, endInedx);
			quickSort(input, startIndex, partitionIndx - 1);
			quickSort(input, partitionIndx + 1, endInedx);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {
			while (arr[i] <= pivot && i <= high-1) {
				i++;
			}
			while (arr[j] >= pivot && j >= low+1) {
				j--;
			}
			if (i < j) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		int temp=arr[j];
		arr[j]=arr[low];
		arr[low]=temp;
		return j;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {5,4,3,2,1,6,7};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
