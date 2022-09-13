package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C04Arraylist {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add("6");
		
		int v1 = (Integer) list.get(0);
		list.get(1);
		
	}
}
