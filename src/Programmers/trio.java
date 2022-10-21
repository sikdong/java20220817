package Programmers;

import java.util.*;

public class trio {
	public static void main(String[] args) {
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
		List<Integer> temp = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		for (int n : number) {
			for(int u : number) {
				for(int a : number) {
					if(n + u + a == 0) {
						
						temp.add(n);
						temp.add(u);
						temp.add(a);
						set.add(temp);
					}
				}
			}
		}
		System.out.println(set.size());
		
	}
}
