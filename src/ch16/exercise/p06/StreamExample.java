package ch16.exercise.p06;

import java.util.*;

public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
		new Member("홍길동", 30),
		new Member("신용권", 40),
		new Member("감자바", 26)
		);
		
		double avg = list.stream()
				.mapToInt((m) -> m.getAge())
				.average()
				.getAsDouble();
				
				System.out.println(avg);
				
	}
}

class Member{
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}
