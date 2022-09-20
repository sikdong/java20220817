package ch16.lecture.p02stream;

import java.util.Arrays;

public class C15MethodReference {
	public static void main(String[] args) {
		String[] arr1 = {"iron", "captain", "widow", "hulk", "panther"};
		
//		Arrays.sort(arr1, (a,b) -> a.compareTo(b));
		Arrays.sort(arr1, String::compareTo); // method reference
		Arrays.sort(arr1, (a,b) -> b.compareTo(a));
		System.out.println(Arrays.toString(arr1));
	}
}
