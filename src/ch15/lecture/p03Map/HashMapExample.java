package ch15.lecture.p03Map;

import java.util.*;

import ch15.exercise.p08.Student;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 entry 수 :" + map.size());
	}
}
