package ch06.lecture.p05final;

public class MyClass1 {
	// static final : 상수
	// 상수명 작성 관습 : UPPER_SNAKE_CASE
	static final int ABC = 9099;
	static final int DEF;
	static final int MY_HOME_NUMBER = 333;
	
	static {
		DEF = 1000;
	}
	
	final int a =5;
	final int b;
	
	MyClass1(){
		b = 9;
	}
	
}
