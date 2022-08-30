package ch06.lecture.p09getset;

public class MyClass1 {
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >=0) {
			
		this.age = age;
		}
	}
}
