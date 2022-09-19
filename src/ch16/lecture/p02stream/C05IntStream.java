package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C05IntStream {
	public static void main(String[] args) {
		// IntStream : 기본타입 int가 요소인 stream
		
		//생성 방법 1 : of static 메소드
		int r1 =IntStream.of(10,9,20,2,3,-1)
			.sum();
		
		System.out.println(r1);
		
		//생성 방법 2: Arrays.stream static 메소드
		int r2 = Arrays.stream(new int[] {10,9,20,2,3,-1})
			.sum();
		System.out.println(r2);
		
		//생성방법 3 : IntStream.range static 메소드
		int r3 = IntStream.range(1, 11)// 11 포함하지 않음
				.sum();
		System.out.println(r3);
		
		int r4 = IntStream.rangeClosed(1, 10) //10도 포함
				.sum();
		System.out.println(r4);
	}
}
