package ch16.exercise.p05;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressoins"
				);
		list.stream()
		.filter(n -> !n.startsWith("L"))
		.forEach(a -> System.out.println(a));
	}
}
