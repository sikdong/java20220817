package ch16.lecture.p02stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C14Collect {
	public static void main(String[] args) {
		List<Integer> list1 = Stream.of(3,4,5,1,0,3,4,5)
		.collect(Collectors.toList());
		
		System.out.println(list1);
		
		Set<Integer> set1 = Stream.of(3,4,5,1,0,3,4,5)
					.collect(Collectors.toSet()); // 중복 제거
	}
}
