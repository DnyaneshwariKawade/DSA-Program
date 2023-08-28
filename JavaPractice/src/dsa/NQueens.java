package dsa;

public class NQueens {
	public static void NQueen(int[][] mat, int row, int N) {
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (isValid(mat, i, j, N)) {
					mat[i][j] = 1;
				}
			}
		}
		printAll(mat, N);
	}

	private static void printAll(int[][] mat, int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static boolean isValid(int[][] mat, int i, int j, int N) {
		int row = i;
		int col = j;

		// check col
		while (row >= 0) {
			if (mat[row][col] == 1) {
				return false;
			}
			row--;
		}
		
		row = i;
		col = j;

		//check row
		while (col >= 0) {
			if (mat[row][col] == 1) {
				return false;
			}
			col--;
		}
		
		row = i;
		col = j;
		// check left D
		while (row >= 0 && col >= 0) {
			if (mat[row][col] == 1) {
				return false;
			}
			row--;
			col--;
		}

		row = i;
		col = j;
		// check right D
		while (row >= 0 && col < N) {
			if (mat[row][col] == 1) {
				return false;
			}
			row--;
			col++;
		}
		return true;
	}

	public static void main(String[] args) {
		int N=6;
		int[][] mat = new int[N][N];
		NQueen(mat, 0, N);
	}
}
