package arrays;

public class BruteForceRotateArray {

	public static void rotateArray(int[] arr, int n, int k){
		if (n == 0) {
			return;
		}
		k = k % n;
		if (k > n) {
			return;
		}
		
		int[] temp = new int[k];
		for (int i = 0; i < n - 1; i++) {
			temp[i] = arr[i];
		}
		
		for(int j=k;j<n-1;j++) {
			arr[j] =arr[j];
		}
		
	}
	public static void main(String[] args) {
		
		
	}

}
