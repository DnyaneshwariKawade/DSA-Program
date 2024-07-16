package dsa.binarySearch;

public class FindMin_BST {

	public static int findMin(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int min = -1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (arr[mid] > arr[right]) {
				left = mid + 1;
			} else {
				right = mid;
				min = arr[mid];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 2, 4, 6, 7, 8, 1, 9 };
		int ans = findMin(arr);
		System.out.println(ans);
	}
}
