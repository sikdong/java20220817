package ch09.lecture.p02lambda;

import java.util.Arrays;

public class MyClass9 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		Arrays.setAll (a1, i -> i);
		
		Arrays.setAll(a1, i -> 10-i);
		System.out.println(Arrays.toString(a1));
		
		Arrays.setAll(a1, i -> 9-i);
		System.out.println(Arrays.toString(a1));
		
	}

	
}
