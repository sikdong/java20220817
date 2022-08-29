package ch06.lecture.p07accessModifier.package2;

import ch06.lecture.p07accessModifier.package1.MyClass1;

public class C02Modifier {
	public static void main(String[] args) {
		
	MyClass1 o1 = new MyClass1();
//	o1.name = "iceman"; // 접근 지정자 생략해서 
	
	
	o1.age = 99;
	o1.printAge();
	
	}
}
