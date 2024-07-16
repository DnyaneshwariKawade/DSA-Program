package dsa.binarySearch;

public class FirstLastIndex {

	public static void solution(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int first = -1;
		int last = -1;
		
		
		
		// find first element
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target == arr[mid]) {
				first = mid;
				right = mid - 1;
			} else if (target > arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		left = 0;
		right = arr.length-1;
		// find last element
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target == arr[mid]) {
				last = mid;
				left = mid + 1;
			} else if (target > arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(first + " " + last);
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 3, 4, 5, 5, 5, 5, 5, 8 };
		solution(arr, 5);
	}

}
