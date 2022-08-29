package ch06.lecture.p03method;

public class C06VarArgs {
	public static void main(String[] args) {
		method1(3);
		method1(3,5,6);
		
	}
	
	//가변인자 (Varargs)
	//같은 타입을 여러 개(몇개인지 모름) 받는 경우
	static void method1(int...i) {
		System.out.println("파라미터 여러개 받는 메소드");
	}
	
	static void method1(int a) {
		System.out.println("인트 파라미터 하나");
	}
	
	//가변인자는 파라미터 목록 끝에만 작성가능
	static void method2(String s, int...i) {
	}

	}
