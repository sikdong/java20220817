package ch04.lecture.p02method;

public class C12Overloading {
	public static void main(String[] args) {
		double a = half(5.0);
		System.out.println(a); // 2.5
		
		int b = half(5);
		System.out.println(b); //2		
	}
	
	public static double half(double a) {
		a = (double) a/2;
		return a;
		
//		return a / 2; 선생님 코드
	}
	
	public static int half(int a) {
		return a/2;
	}
}
