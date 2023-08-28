package dsa;

public class ProductOfDigit {

	public static int solution(int num) {

		String ans = "";
		for (int i = 9; i >= 2; i--) {

			while (num % i == 0) {
				num = num / i;
				ans = i + ans;
			}
		}
		
		if(num!=1) {
			return -1;
		} else {
			return Integer.parseInt(ans);
		}
	}

	public static void main(String[] args) {
		System.out.println(solution(1000));
	}
}
