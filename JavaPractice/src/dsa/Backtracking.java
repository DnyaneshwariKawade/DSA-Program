package dsa;

public class Backtracking {

	public static void printAll(int arr[], int i, int N) {
		if (i == 3) {
			System.out.println(arr[0] + " " + arr[1]+" "+arr[2]);
			return;
		}
		arr[i] = 1;
		printAll(arr, i + 1, N);
		arr[i] = 2;
		printAll(arr, i + 1, N);
		return;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 0 ,0 };
		printAll(arr, 0, 3);
	}
}
