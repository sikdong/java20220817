package ch16.lecture.p02stream;

import java.util.Optional;
import java.util.stream.Stream;

public class C03TermianlOperation {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		stream1.forEach((e) -> System.out.println(e));
		
		Stream<String> stream2 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		
		Optional<String> op1 = stream2.reduce((a,b)->a + ", " + b);
		
		Stream<String> stream3 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		
		String o2 = stream3.reduce("heroes", (a,b) -> a + ", " + b);
		System.out.println(o2);
	}
}
