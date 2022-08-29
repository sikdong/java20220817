package ch06.lecture.p07accessModifier.package1;

public class MyClass1 {
	// 필드
	// 접근 제한자 생략하면 같은 패키지 내에서 사용 가능
	// package private(default)
	String name;
	
	//public : 다른 패키지에서도 사용 가능
	public int age;
	
	//메소드 
	void printName() {
		System.out.println(name);
	}
	
	public void printAge() {
		System.out.println(age);
	}
	
}
