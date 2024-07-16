package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JavaStream {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("1", "2", "3", "Four", "5");
		List<Integer> nums = strings.stream().map(s -> {
			try {
				return Integer.parseInt(s);
			} catch (Exception e) {
				return null;
			}
		}

		).filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(nums);
	}
}
