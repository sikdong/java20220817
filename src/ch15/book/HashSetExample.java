package ch15.book;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element= iterator.next();
			System.out.println("\t" + element);
			
			
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		}
}
