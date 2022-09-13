package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C07WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(200);
		list1.add(300);
	}
	
	public static void getItems(ArrayList<? extends Number> list) {
		Number n1 = list.get(0);
		Number n2 = list.get(1);
	}
}
