package stream;

import java.util.stream.Stream;

public class Iterate {

	public static void main(String[] args) {
		System.out.println("iterate");
		Stream.iterate(0, i -> i < 5, i -> i + 1).forEach(System.out::println);
		System.out.println("limit");
		Stream.iterate(1, i -> (i + 1)).limit(10).forEach(System.out::println);
	}
}
