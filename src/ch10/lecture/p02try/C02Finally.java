package ch10.lecture.p02try;

public class C02Finally {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try {
			int c = a / b;
			
			System.out.println("익셉션 발생안해서 실행됨");
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("익셉션 발생하면 실행되는 코드들");
		} finally {
			//익셉션 발생 여부 관계없이 실행되는 코드
			System.out.println("익셉션 발생 여부 관계없이 실행");
		}
		
		System.out.println("실행 흐름 계속 이어감");
	}
}
