package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C06WildCard {
	public static void main(String[] args) {
		//Upper Bounded WildCard
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		
		ArrayList<? super Integer> list2 = list1;
		list2.add(300);
		
		ArrayList<? extends Integer> list3 = list1;
		Integer i1 = list3.get(0);
	}
}
