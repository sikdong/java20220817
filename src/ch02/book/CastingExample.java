package ch02.book;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		int intValue1 = (int) longValue;
		System.out.println(intValue1);
		
		double doubleValue = 3.14;
		intValue1 = (int) doubleValue;
		System.out.println(intValue1); // 소수점 떨어짐
		
		
		
	}
}
