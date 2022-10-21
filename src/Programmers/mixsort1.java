package Programmers;

import java.util.*;

public class mixsort1 {
	// 고정적인 건 n 가변적인 건 strings의 개수
	public static void main(String[] args) {
		String[] str = {"abce", "abcd", "cdx"};
		int n = 2;
		int i = 0;
		boolean stop = true;
		Map<Integer, Character> map = new HashMap<>();
		while(stop) {
			map.put(i, str[i].charAt(n));
			i++;
			if(i > str.length) {
				stop = false;
			}
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int j = 0; j < map.size(); j++) {
			for(int t = 0; t < map.size(); t++) {
				if(map.get(j).equals(map.get(t))&&j!=t) {
					set.add(j);
					set.add(t);
					map.remove(t);
				}
			}
			
		}
	}
}
