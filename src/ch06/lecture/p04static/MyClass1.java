package ch06.lecture.p04static;

public class MyClass1 {
	//non static field
	String name;
	
	static String company;
	
	//생성자 constructor
	public MyClass1(String name) {
		this.name = name;
	}
	
	void printName() {
		System.out.println(name);
	}
}
