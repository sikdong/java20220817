package ch15.exercise.p09;

import java.util.*;

public class MapExample {
 public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("blue", 96);
	map.put("hong", 86);
	map.put("white", 92);
	
	String name = null;
	int maxScore = 0;
	int totalScore = 0;
		Set<String> names = map.keySet();
	for (String item : names) {
		totalScore += map.get(item);
		maxScore = Math.max(maxScore, map.get(item));
	}
	
	
	Set<Map.Entry<String, Integer>> entries = map.entrySet();
	for (Map.Entry<String, Integer> entry : entries) {
	if(entry.getValue() == maxScore) {
		name = entry.getKey();
		}
	}
	
	int avg = totalScore / map.size();
	System.out.println("평균점수: "+ avg);
	System.out.println("최고점수: "+ maxScore);
	System.out.println("최고점수를 받은 아이디: " + name);
	
	
 }
}
