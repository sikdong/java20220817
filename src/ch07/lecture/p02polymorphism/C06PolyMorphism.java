package ch07.lecture.p02polymorphism;

public class C06PolyMorphism {
	public static void main(String[] args) {
		SubClass3 o1 = new SubClass3();
		
		SuperClass3 o2 = o1;
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
	}
}
