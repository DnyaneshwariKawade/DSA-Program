package dsa.binarySearch;

public class PositionOfTarget {

	public static int solution(int[] arr, int left, int right, int target) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static int findMin(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int minIndex = 0;
		while (left < right) {
			int mid = (left + right) / 2;
			if (arr[mid] < arr[right]) {
				minIndex = mid;
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		// System.out.println(min);
		return minIndex;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 11, 14, 15, 20, 22, 25, 1, 3, 5, 7 };
		// int[] arr1 = { 9, 11, 14, 2, 3, 5, 7,15, 20, 22, 25};
		// System.out.println(findMin(arr));
		int minIndex = findMin(arr);
		System.out.println("minIndex:: " + minIndex);
		int target = 15;
		int ans = solution(arr, 0, minIndex, target);
		if (ans == -1) {
			ans = solution(arr, minIndex, arr.length - 1, target);
		}
		System.out.println("Target element present at:: " + ans);
	}
}
