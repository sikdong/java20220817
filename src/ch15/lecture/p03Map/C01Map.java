package ch15.lecture.p03Map;

import java.util.*;


public class C01Map {
	public static void main(String[] args) {
		
	//Map
	// (key, value) 쌍(entry)으로 저장
	// key는 중복될 수 없음 
	// key는 하나의 value에 매핑됨
	
	Map<String, String> map = new HashMap<>();
	
	// entry 추가
	map.put("jimin", "bts");
	map.put("hangman", "topgun");
	map.put("batman", "dc");
	map.put("jimin", "HOT"); //이미 있는 키, 밸류 덮어 씀
	
	//entry 수
	int size = map.size();
	System.out.println(size);
	
	//지우기
	map.remove("batman");
	
	//이미 있는 키 인가?
	boolean hasJimin = map.containsKey("jimin");
	
	
	//value 얻기
	String val1 = map.get("jimin");
	System.out.println(val1);
	
	
	
	
	}
}
