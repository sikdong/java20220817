package ch06.book.s061101;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234657", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "47654698"
		p1.name = "을지문덕";
		System.out.println(p1.name);
		
		
	}
}
