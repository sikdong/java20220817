package ch04.lecture.p02method;

public class C09Return { 
	public static void main(String[] args) {
		
	long a = sum(1, 10);
	System.out.println(a);
	//1 ~ 10 사이 정수의 합
	}
	
	public static long sum(int a, int  b) {
		long total = 0;
		for (int i = a; i <= b; i++) {
			total += i;
		}
		return total;
	}
}
