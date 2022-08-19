package ch03.lecture.p2binary;

public class C04StringToNumber {
	public static void main(String[] args) {
		String a = "10";
		int b = 30;
		
		System.out.println(a + b); // "1030"
		
		int c = Integer.valueOf(a); // valueOf - 각 타입으로 변경
		System.out.println(c + b); // 40
		
		String d = "3.14";
		double e = 9.8;
		
		System.out.println(d + e);
		
		double f = Double.valueOf(d);
		System.out.println(f + e);
		
		// 기본 타입과 매치되는 참조 타입 
		// int : Integer
		// long : Long
		//.....
		// char : Character
		
	}
}
