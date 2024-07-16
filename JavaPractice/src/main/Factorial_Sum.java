package main;

public class Factorial_Sum {
	
	public static int sum(int n, int result) {
		if (n == 0) {
			return 0;
		}
		// sum = sum + b;
		result = n + sum(n - 1, result);
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(5,0));
	}
}
