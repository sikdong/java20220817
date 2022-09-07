package ch11.book.p111200;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		int value = obj;
		System.out.println("value: " + value);
		
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
