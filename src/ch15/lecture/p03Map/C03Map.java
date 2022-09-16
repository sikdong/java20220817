package ch15.lecture.p03Map;

import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		
	Map<String, String> map = Map.of("rice", "korea", 
					"noodle", "japan", 
					"rice noodle", "vietnam");
	
	System.out.println(map);
	}
}
