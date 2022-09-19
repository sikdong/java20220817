package ch16.lecture.p02stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C02TerminalOperation {
	public static void main(String[] args) {
		// stream 연산
		// 1. 중간 연산
		// 2. 종료 연산
		
		// 구분법 : 중간 연산(method) 은 리턴 타입이 xxxstream
					// 최종 연산(method) 은 리턴 타입이 stream이 아님(주로)
		
		Stream<String> stream1 = List.of("java", "css", "spring", "html", "jsp").stream();
		
		//findAny : 아무거나 하나
		Optional<String> option1 =  stream1.findAny();
		
		System.out.println(option1.orElse("없네요"));
		
//		Optional<String> option2 = stream1.findFirst();
		
//		System.out.println(option2.orElse("없네요")); // 스트림은 재샤용 불가
		
		Stream<String> stream3 = List.of("java", "css", "spring", "html", "jsp").stream();
		Optional<String> option3 = stream3.max((a,b)->a.compareTo(b));
		System.out.println(option3.get());
		
		
		
	}
}
