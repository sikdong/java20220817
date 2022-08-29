package ch06.lecture.p04static;

public class MyClass2 {
	String name;
	
	static String company = "topgun";
	static int rank;
	
	static {
		int a = 30;
		int b = 90;
		rank = a * b;
	} // 복잡한 코드는 static 필드에 넣으면 된다. 
	
	public MyClass2(String name) {
		this.name = name;
	}
}
