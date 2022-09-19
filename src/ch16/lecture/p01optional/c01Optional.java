package ch16.lecture.p01optional;

import java.util.Optional;

public class c01Optional {
	public static void main(String[] args) {
		Optional<String> obj1 = Optional.empty();
		Optional<String> obj2 = Optional.of("java");
		
		System.out.println(obj1.isEmpty());
		System.out.println(obj2.isEmpty());
		
		System.out.println(obj1.isPresent());
		System.out.println(obj2.isPresent());
		
		String str2 = obj2.get();
		System.out.println(str2);
		
		
	}
}
