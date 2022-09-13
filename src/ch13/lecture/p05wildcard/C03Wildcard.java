package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C03Wildcard {

	public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<>();
	list1.add("maverick");
	
	
	ArrayList<?> list2 = list1; // ? : unbounded wildcard 무슨 타입이든 가능
//	list2.add("");  // x
//	list2.add(200); // x
	}

}
