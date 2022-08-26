package ch06.lecture.p02constructor;

public class MyClass1 {
	//fields
	String name;
	
	//생성자(constructor)
	// 하는 일 : 인스턴스 생성시 초기화 하는 일
	//생성자명 : 클래스 명과 같다
	//() : 파라미터 목록
	//{} : 실행코드 
	//생성자는 파라미터 타입, 개수, 순서를 구분해서 여러 개 만들 수 있다.
	public MyClass1() {
		System.out.println("파라미터 없는 생성자 실행됨 ");
	}
	
	public MyClass1(String n) {
		System.out.println("파라미터 있는 생성자 실행됨");
		name = n;
	}
}
