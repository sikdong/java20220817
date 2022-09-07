package ch11.lecture.p01object;

public class C02Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.equals(o2));
		System.out.println(o2.equals(o1));
		
		System.out.println("String equals()");
		
		
		Object o3 = new String("topgun");
		Object o4 = new String("topgun");
	}
}
