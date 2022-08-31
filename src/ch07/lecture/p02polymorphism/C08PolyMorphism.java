package ch07.lecture.p02polymorphism;

public class C08PolyMorphism {
	public static void main(String[] args) {
		String a = "maverick";
		
		System.out.println(a.length());
		
		Object b = "coyote";
//		System.out.println(b.length());
		// 사용할 수 있는 메소드는 참조 타입에 의해 결정
		// 실제 실행되는 메소드는 인스턴스에 의해 결정
		
		String c = (String) b;
		System.out.println(c.length());
	}
}
