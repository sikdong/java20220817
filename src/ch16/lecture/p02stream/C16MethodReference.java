package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C16MethodReference {
	public static void main(String[] args) {
		
		Integer a = IntStream.of(3,9,1,0,10)
			.boxed()
//			.max((x, y) ->x.compareTo(y))
			.max(Integer :: compareTo)
			.get();
		
		System.out.println(a);
		
		
	}
}
