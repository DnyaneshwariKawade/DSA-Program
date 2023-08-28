package main;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 151;
		int result = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			result=result*10+rem;  // Palindrom Number
			//result += (rem * rem * rem); //Armsstrong number
			num = num / 10;
		}
		System.out.println(result);

	}

}
