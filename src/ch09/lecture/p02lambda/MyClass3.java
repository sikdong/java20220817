package ch09.lecture.p02lambda;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 o1 = (String s) -> System.out.println(s);
		
		o1.method("hells");
		
		MyInterface3 o2 = (s) -> System.out.println(s.repeat(2));
		
		o2.method("안녕");
		
		MyInterface3 o3 = s -> System.out.println(s.repeat(3));// 파라미터 한개인경우 둥근 가로도 생략가능
		
		o3.method("ya");
	}
	
	
}

interface MyInterface3 {
	void method(String s);
}
