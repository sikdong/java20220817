package ch15.lecture;

import java.util.ArrayList;
import java.util.List;

public class p01List {
	public static void main(String[] args) {
		// List : 순서 있음
		
		List<String> list1 = new ArrayList<>();
		// add :  element(item) 추가
		list1.add("coyote");
//		list1.add(3);
		list1.add("phoenix");
		list1.add("goose");
		
		//get : element 얻기
		list1.get(0);
		list1.get(1);
		
		// IndexOutOfBoundsException 주의
//		System.out.println(list1.get(3));
		
		// size : List의 길이(아이템의 갯수)
		int len = list1.size();
		
		System.out.println(len);
		
	}
}
