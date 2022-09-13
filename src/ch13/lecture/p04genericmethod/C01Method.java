package ch13.lecture.p04genericmethod;

public class C01Method {
	public static void main(String[] args) {
		C01Method.<String> method("str");
		
		//메소드 타입 파라미터 생략 가능
		method(3);
	}
	
	public static <T> void method(T p) {
		
	}
	
	public static void method1(String s) {
		
	}
}
