package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C04IntetmediateOperation {
	public static void main(String[] args) {
		// 중간 연산: 리턴 타입이 - xxxStream

		// limit : element 몇개까지
		Integer r1 = Stream.of(3, 4, 5, 9, -1, 10, 11)
				.limit(5)
				.max((x, y) -> x - y)
				.get();

		System.out.println(r1);

		// skip : element 몇 개 무시
		Integer r2 = Stream.of(3, 4, 5, 9, 10, 11)
				.skip(2)
				.min((x, y) -> x - y)
				.get();

		// filter : Predicate에서 true 나온 것만 추림
		Integer s3 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e % 2 == 0)
				.reduce((x, y) -> x + y)
				.get();

		Integer s4 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e % 2 == 1)
				.reduce((x, y) -> x + y)
				.get();

		System.out.println(s4);

		// distinct : 중복 제거
		Integer r5 = Stream.of(3, 3, 4, 4, 5, 5, 6, 7)
				.distinct()
				.reduce((x, y) -> x + y)
				.get();
		System.out.println(r5);

		Stream.of(5, 3, 0, 7, 9, 1)
				.sorted()
				.forEach((e) -> System.out.println(e));
	
	
	}
}
