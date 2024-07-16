package main;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			if(true) {
				System.out.println("test");
				break;
			}
		}
		List<String> strings= Arrays.asList("1","2","3","Four","5");
        System.out.println(strings);
        List<Integer> nums= strings.stream().map(s-> {
                try{
                    return Integer.parseInt(s);
                } catch(Exception e) {
                    return null;
                }}
                ).filter(Objects::nonNull)
                .collect(Collectors.toList());
		
		
	}

}
