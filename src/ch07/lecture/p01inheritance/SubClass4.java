package ch07.lecture.p01inheritance;

public class SubClass4 extends SuperClass4 {

	//상위 클래스 메소드 재정의(오버라이딩) 가능 
	@Override // 컴파일러에게 재정의(override) 메소드인지 점검 받는 annotation
	public void method1() {
		System.out.println("SubClass4 method1");
	}
	
	
	public void method2() {		
		System.out.println("SubClass4 method2");
	}
	
	@Override
	public void method3() {
		System.out.println("SuperClass4 method3 재정의");
	}
}
