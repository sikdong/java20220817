package ch16.lecture.p02stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C06IntStream {
	public static void main(String[] args) {
		// 1~10까지 출력
		IntStream.range(1, 11)
				.forEach(n -> System.out.println(n));
		System.out.println("----------");

		// 1~100까지의 합 출력
		int r1 = IntStream.rangeClosed(1, 100)
				.sum();
		System.out.println(r1);
		System.out.println("----------");

		// [5, 10, 20, 1, 6]의 평균 구하기
		Double r2 = IntStream.of(5, 10, 20, 1, 6)
				.average()
				.getAsDouble();
		System.out.println(r2);
			
		System.out.println("----------");

		// 주사위(1~6) 5번 던진 결과 출력 (작은 수 부터 출력)
		IntStream.generate(() -> (int) (Math.random()*6) +1)
				.limit(5)
				.sorted()
				.forEach(n -> System.out.println(n));
				
		System.out.println("----------");		

		// 로또번호(1~45) 6개 (작은 수 부터 출력 중복 없이)
		IntStream.generate(() -> (int) (Math.random()*45)+1)
				.limit(6)
				.distinct()
				.sorted()
				.forEach(n -> System.out.println(n));
	
	}
}
