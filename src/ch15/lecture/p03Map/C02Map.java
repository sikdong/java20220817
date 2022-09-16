package ch15.lecture.p03Map;

import java.util.*;

public class C02Map {
	public static void main(String[] args) {
		//전체 entry 탐색
		
		Map<String,String> map = new HashMap<>();
		map.put("korea", "seoul");
		map.put("japan", "tokyo");
		map.put("us", "new york");
		map.put("uk", "london");
		map.put("france" , "paris");
		
		//keySet 이용
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String val = map.get(key);
			System.out.println(key + ":" + val);
		}
		
		
		
		//EntrySet 이용
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		
	}
}
