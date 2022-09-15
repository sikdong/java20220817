package ch15.lecture.p02set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		//  아이템 (element) 추가
		set.add("ironman");
		set.add("captain");
		
		//element 수
		int size = set.size();
		System.out.println(size);
		
		//중복 저장 할 수 없음
		set.add("ironman");
		
		//이미 있는 지 확인
		System.out.println(set.contains("ironman")); // 있으면 true, 없으면 false;
		
		//지우기
		set.remove("caotain");
		
	}
}
