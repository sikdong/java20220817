package ch09.lecture.p01nestedClass;

public class MyClass2 {
	public static void main(String[] args) {
		class LocalClass implements MyInterface2{
			@Override
			public void method() {
				System.out.println("재정의한 메소드");
			}
		}
		
		MyInterface2 o1 = new LocalClass();
		o1.method();
	}
	
}

interface MyInterface2 {
	void method();
} 
