package ch07.lecture.p02polymorphism;

public class C07Polymorphism {
	public static void main(String[] args) {
		SuperClass4 o1 = new SuperClass4();
		
		o1.method1();
		o1.method2();
		o1.method3();
		
		SubClass41 o2 = new SubClass41();
		o2.method1();
		o2.method2();
		o2.method3();
		
		SuperClass4 o3 = new SubClass41();
		
		o3.method1();
		o3.method2();
		o3.method3();
		
		//실제 정의한 SubClass41 의 메소드가 실행됨
		
		
	}
}
