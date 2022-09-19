package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		
		System.out.println("향상된 포문");
		for (String item : set) {
			System.out.println(item);
		}
		
		set.forEach((e) -> System.out.println(e));
		
		
		
	}
}
