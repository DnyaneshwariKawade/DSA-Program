package main;

import java.util.Arrays;

public class Hashing {

	public static void main(String[] args) {
		
		int n = 'a';
		System.out.println(n);
		String str = "kiran";
		int[] arr = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-'a'] += 1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
