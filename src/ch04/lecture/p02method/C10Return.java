package ch04.lecture.p02method;

public class C10Return {
	public static void main(String[] args) {
		int a = max(3, 5);
		System.out.println(a); // 5
		
		int b = max(5, 3);
		System.out.println(b); // 5	
		
		int c = max(-100, 100);
		System.out.println(c);
	}
	
	public static int max(int a, int b) {
			return ((a > b) ? a : b);
				
	}
}
