package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C10Parellel {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		double avg1 = IntStream.range(1, Integer.MAX_VALUE)
					.filter((n) -> n % 2 == 0)
					.average()
					.getAsDouble();
		
		System.out.println(avg1);
		long end = System.currentTimeMillis();
		
		
		start = System.currentTimeMillis();
		double avg2 = IntStream.range(1, Integer.MAX_VALUE)
					.parallel()
					.filter((n) -> n % 2 == 0)
					.average()
					.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println(avg2);			
					

	}
}
