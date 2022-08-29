package ch06.lecture.p04static;

public class C01Static {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1("coyote");
		o1.printName();
		
		MyClass1 o2 = new MyClass1("maverick");
		
		o1.company = "topgun";
		System.out.println(o1.company);
		
		MyClass1.company = "middlegun";
		System.out.println(o1.company);
		System.out.println(o2.company);
		
	}
}
