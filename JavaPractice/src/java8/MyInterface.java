package java8;

import java.util.function.Function;
import java.util.stream.IntStream;

public interface MyInterface {
	
	IntStream flatMapToInt(Function<? super IntStream, ? extends IntStream> mapper);

	public static void main(String[] args) {
		System.out.println("Hii");

		int sum = IntStream.iterate(1, i -> i + 1)
				.limit(5)
				.peek(i -> {})
				.filter(i -> i % 2 == 0)
				.sum();
		System.out.println(sum);
	}
}
