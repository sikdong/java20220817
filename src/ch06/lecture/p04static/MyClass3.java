package ch06.lecture.p04static;

public class MyClass3 {
	// instance field
	String name;
	
	//static field
	static String company = "topgun";

	public MyClass3(String name) {
		this.name = name;
	}
	
	//static method
	static void printCompany() {
//		System.out.println(this.company); 
		//static은 this로 접근할 수 없음
		// this는 추후 만들어질 instance이기 때문
		System.out.println(company);
	}
	
	//instance method;
	void printName() {
		System.out.println(this.name);
	}
	
	void showCompany() {
		System.out.println(company);
	}
}
