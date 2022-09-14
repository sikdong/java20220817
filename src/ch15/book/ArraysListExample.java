package ch15.book;

import java.util.*;

public class ArraysListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for (String name : list1) {
			System.out.println(name);
		}
		
		System.out.println();
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		list1.forEach((a) -> {
			System.out.println(a);
		});
		
		System.out.println();
		
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for (int value : list2) {
			System.out.println(value);
		}
		
		System.out.println();
		
		for(int i =0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println();
		
		list2.forEach((a) -> System.out.println(a));
		
		System.out.println();
		
		Iterator<Integer> iterator1 = list2.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}
}
