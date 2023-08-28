package java8;

import java.util.stream.Stream;

public class Program {

	public enum Game {
		CRICKET(1), FOOTBALL(2);

		private int value;

		Game(int value) {
			this.value = value;
		}

		public static Game data(int val) throws Exception {
			return Stream.of(Game.values()).filter(type -> type.value == val).findFirst()
					.orElseThrow(() -> new Exception(" Invalid Input"));
		}
	}

	public static void main(String... args) throws Exception {
		System.out.print(Game.data(2));
	}
}
