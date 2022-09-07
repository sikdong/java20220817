package ch10.lecture.p02try;

public class C03Finally {
	public static void main(String[] args) {
	int a = 2/0;
		
		
	try {
		int b = 3/0;
		if(b == 1) {
			return;
		} 
	} catch (ArithmeticException e) {
		System.out.println("exception");
	} finally {
		
	}
}
}
