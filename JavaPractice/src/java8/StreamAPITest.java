package java8;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPITest {

	public static void main(String[] args) throws InterruptedException {

		Stream<Integer> nums = Stream.of(5, 4, 3, 8, 1);
		Optional<Integer> maxNum = nums.max((m1, m2) -> m1.compareTo(m2));
		System.out.println(maxNum.get());
		// Thread.sleep(1000);
		Stream<Integer> num = Stream.of(5, 4, 3, 8, 1);
		
		//num.collect(Collectors.groupingBy(Collectors.averagingInt(Integer::valueOf)));
		System.out.println(); num.sorted();
		int sum = num.mapToInt(Integer::intValue).sum();
		System.out.println("sum:: " + sum);

	}

}
