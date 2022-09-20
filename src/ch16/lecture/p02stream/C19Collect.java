package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C19Collect {
	public static void main(String[] args) {

		double avg1 = IntStream.of(10, 9, 7, 1, 20, 100, 50)
				.boxed()
				.collect(Collectors.averagingDouble(Double::valueOf));
		
		 long count1 = IntStream.of(10, 9, 7, 1, 20, 100, 50)
				.filter(C19Collect::even)
				.boxed()
				.collect(Collectors.counting());
	}
	
	private static boolean even(int n) {
		return n %2 ==0;
	}
}
