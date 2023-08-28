package dsa;

public class RotateMatrix90 {

	public static void printAll(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "    ");
			}
			System.out.println();
		}
	}

	public static void rotate90(int[][] arr) {
		System.out.println("=====rorate90======");
		for (int row = 0; row < arr[0].length; row++) {

			for (int col = row + 1; col < arr[0].length; col++) {

				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
		printAll(arr);

		int left = 0;
		int right = arr[0].length - 1;
		while (left <= right) {

			for (int i = 0; i < arr[0].length; i++) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
			}
			left++;
			right--;
		}
		System.out.println("After swipe");
		
		printAll(arr);

	}

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		printAll(arr);
		rotate90(arr);
	}

}
