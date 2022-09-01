package ch07.lecture.p03abstract;

public abstract class SuperClass2 {
	// 추상메소드를 가지고 있으면 무조건 추상 클래스
	
	public abstract void cry(); 
	// 추상 메소드
	// body가 없는 메소드
	// 상속받는 클래스가 꼭 구현해야함
	
	public void walk() {
		System.out.println("네발로 걷습니다.");
	}
	
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
}
