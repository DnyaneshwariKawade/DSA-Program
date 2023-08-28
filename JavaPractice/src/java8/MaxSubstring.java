package java8;

import java.util.HashSet;
import java.util.Set;

public class MaxSubstring {

	public static void main(String[] args) {
		//String s1 = "pwwkew";
		String s1="abcabcbb";
		Set<Character> set = new HashSet<>();
		char[] ch = s1.toCharArray();
		int count=0;
		int max=0;
		for (int i = 0; i < ch.length; i++) {
			
			if(set.add(ch[i])) {
				count++;
			} else {
				i--;
				if(count>max) {
					max=count;
				}
				set.clear();
				count =0;
			}
			
		}
		System.out.println("max substring:: "+max);

	}

}
