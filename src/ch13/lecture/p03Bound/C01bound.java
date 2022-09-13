package ch13.lecture.p03Bound;

public class C01bound {
	public static void main(String[] args) {
		
	}
}

// 제한된 타입 파라미터
// bounded type parameter

class MyClass2<T extends Number>{
	public void method1(T p) {
		p.doubleValue();
		p.intValue();
	}
}

class MyClass1<T>{
	public void method1(T p) {
		p.toString();
		p.equals(null);
		p.hashCode();
	}
}
