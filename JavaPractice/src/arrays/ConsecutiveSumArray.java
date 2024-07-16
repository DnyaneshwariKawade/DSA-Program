package arrays;

public class ConsecutiveSumArray {

	public static void main(String[] args) {
		
		//int[] arr= {1,1,0,1,1,1};
		int[] arr={1, 0, 1, 1, 0, 1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,0};
		
		int left=0;
		int right=1;
		int max=0;
		int counter=1;
		while (left < right && right<arr.length) {
			if (arr[left] == arr[right]) {
				counter++;
				right++;
			} else {
				counter=1;
				left = right;
				right++;
			}
			if (counter > max) {
				max = counter;
			}
		}
		System.out.println(max);
		
	}

}
