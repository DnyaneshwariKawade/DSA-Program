package arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int n = 7;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		// brute force approach
		//Rotatetoright(arr, n, k);
		//rotateToLeft(new int[] { 1, 2, 3, 4, 5, 6, 7 }, n, k);

		// optimal app oach
		rightRotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, k);
		leftRotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, k);

	}

	private static void Rotatetoright(int[] arr, int n, int k) {
		int[] temp = new int[n];
		int index = 0;
		for (int i = k; i < n; i++) {
			temp[i] = arr[index++];
		}

		for (int i = 0; i < k; i++) {
			temp[i] = arr[index++];
		}
		System.out.println("brute force approach Right rotate::" + Arrays.toString(temp));
	}

	private static void rotateToLeft(int[] arr1, int n, int k) {
		int arr[] = { 3, 7, 8, 9, 10, 11 };
		k = 3;
		n = 6;

		int[] temp = new int[n];
		int index = 0;
		for (int i = k; i < n; i++) {
			temp[index++] = arr[i];
		}

		for (int i = 0; i < k; i++) {
			temp[index++] = arr[i];
		}
		System.out.println("brute force approach Left rotate::" + Arrays.toString(temp));
	}

	private static void rotate(int[] arr, int left, int right) {

		while (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	// right rotate optimal solution
	public static void rightRotate(int[] arr, int k) {
		int n = arr.length;
		rotate(arr, 0, n - k - 1);
		rotate(arr, n - k, n - 1);
		rotate(arr, 0, n - 1);
		System.out.println("Right rotate optimal solution:: " + Arrays.toString(arr));
	}

	// left rotate optimal solution
	public static void leftRotate(int[] arr, int k) {
		int n = arr.length;
		rotate(arr, 0, k-1);
		rotate(arr, k, n - 1);
		rotate(arr, 0, n - 1);
		System.out.println("left rotate optimal solution:: " + Arrays.toString(arr));
	}

}
