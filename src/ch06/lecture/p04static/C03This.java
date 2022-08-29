package ch06.lecture.p04static;

public class C03This {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3("Maverick");
		
		System.out.println(o1.name);
		o1.printName();
		
		MyClass3 o2 = new MyClass3("bob");
		System.out.println(o2.name);
		o2.printName();
	}
}
