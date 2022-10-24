
package Programmers;

import java.util.*;
public class pickTwo {
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j< numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		for(int s : set) {
			
			System.out.println(s);
		}
	}
}
