package ch09.lecture.p02lambda;

public class MyClass4 {
	public static void main(String[] args) {
		
	MyInterface4 o1 = (String s, int a) -> System.out.println(s + a);
	MyInterface4 o2 = (s, a) -> System.out.println(s.repeat(a));
	}
}



interface MyInterface4 {
	void method(String s, int b);
}