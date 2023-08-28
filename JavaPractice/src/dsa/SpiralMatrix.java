package dsa;

public class SpiralMatrix {

	public static void spiralMatrix(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int count = 0;
		int rmin = 0;
		int cmin = 0;
		int rmax = arr.length - 1;
		int cmax = arr[0].length - 1;

		while (count < n * m) {

			// top boundry
			for (int col = cmin; col <= cmax && count < n * m; col++) {
				System.out.print(arr[cmin][col]+", ");
				count++;
			}

			rmin++;
			// right boundary
			for (int row = rmin; row <= rmax && count < n * m; row++) {
				System.out.print(arr[row][cmax]+", ");
				count++;
			}

			cmax--;
			// bottom boundry
			for (int col = cmax; col >= cmin && count < n * m; col--) {
				System.out.print(arr[rmax][col]+", ");
				count++;
			}
			rmax--;
			// left boundry
			for (int row = rmax; row >= rmin & count < n * m; row--) {
				System.out.print(arr[row][cmin]+", ");
				count++;
			}
			cmin++;
			

		}

	}

	public static void main(String[] args) {

//		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
//				{ 16, 17, 18, 19, 20 } };
				
		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, 
			{ 11, 12, 13, 14, 15 }};		
		printAll(arr);
		spiralMatrix(arr);
	}

	public static void printAll(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "    ");
			}
			System.out.println();
		}
		System.out.println("======================");
	}

}
