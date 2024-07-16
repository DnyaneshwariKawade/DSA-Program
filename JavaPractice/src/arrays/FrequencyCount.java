package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {
		
		final List<Integer> list= Arrays.asList(10,20);
        list.add(10);
        
		Scanner sc = new Scanner(System.in);

        String s;
     //   s = sc.next();
        s="kkiran";
        //precompute:
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(hash));
        
        for (int i = 0; i < s.length(); i++) {
        	System.out.println(s.charAt(i)+"="+hash[s.charAt(i) - 'a']);
        }
        
//        int q;
//        q = sc.nextInt();
//        while (q-- > 0) {
//            char c;
//            c = sc.next().charAt(0);
//            // fetch:
//            System.out.println(hash[c - 'a']);
//        }

	}

}
