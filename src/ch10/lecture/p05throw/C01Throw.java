package ch10.lecture.p05throw;

public class C01Throw {
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		System.out.println("코드1");
		System.out.println("코드2");
		
		throw new RuntimeException();
	}
}
	


