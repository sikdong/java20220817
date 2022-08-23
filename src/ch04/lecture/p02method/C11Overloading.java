package ch04.lecture.p02method;

public class C11Overloading {
	public static void main(String[] args) {
		
		
		method2(9);
		method2();
		method2(3.14);
		
		
	}
	
	
	public static void method2(double a) {
		
	}
	
	
	
	public static void method1(int a, int b) {
			
	}
	
	public static void method2(int a) {
		// 메소드 명이 같아도 파라미터의 타입, 개수 ,순서가 다르면 다른 메소드가 된다
		// 메소드 overloading 
		
		System.out.println("파라미터 있는 메소드2");
	}
	
	public static void method2() {
		
		System.out.println("파라미터 없는 메소드2");
		
	}
 	

}
