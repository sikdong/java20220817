package ch03.lecture.p2binary;

public class C05Comparison {
	public static void main(String[] args) {
		// 비교 연산자
		// <, <=, >, >=, ==, !==
		// 연산 결과는 boolean
		// 피연산자는 같은 타입만 가능
		
		int a = 8;
		int b = 5;
		
		boolean c = a < b;
		System.out.println(c);
		System.out.println(a < b);
		
		String e = "8";
//		System.out.println(b < e); // x
		System.out.println(b < Integer.valueOf(e));
	}
}
