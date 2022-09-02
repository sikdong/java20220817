package ch08.lecture.p03others;

public interface MyInterface1 {
	void method();
	
	
	
	// public 생략됨
	// 인터페이스는 다 public
	default void method2() {
		//interface default method
		// 재정의하지 않아도 되는 instance method
	}
}
