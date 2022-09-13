package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C05Generic {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
//		list.add(6);
		list.add("6");
		
		String v1 = list.get(0);
		
		System.out.println(v1);
	}
}
