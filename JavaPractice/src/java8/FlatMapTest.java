package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        //Stream.of("1","2","3","4");
       List<Integer> list1=Arrays.asList(1,2,3,4,5);
       List<Integer> list2=Arrays.asList(6,7,8,9);
       List<Integer> list3=Arrays.asList(22,33,44,55);

       List<List<Integer>> list=new ArrayList<>();
       list.add(list1);
       list.add(list2);
       list.add(list3);
       System.out.println("<----FlatMap()--->");
       List<Integer> result= list.stream().flatMap((List<Integer> l)->l.stream()).collect(Collectors.toList());
       result.stream().forEach(System.out::println);
       System.out.println("<----FlatMapToInt()--->");
       IntStream result1= list.stream().flatMapToInt((List<Integer> l)->l.stream().mapToInt(Integer::valueOf));

       //IntStream result1= list.stream().flatMapToInt((List<Integer> l)->l.stream().mapToInt(Integer::valueOf));
       result1.forEach(System.out::println);
    }
}
