package ch04.lecture.p02method;

public class C06Parameter {
	public static void main(String[] args) {
		sum(1, 10); // 1~10 사이의 정수 합 출력
	}
		
		public static void sum(int a, int b) {
			long sum = 0;
			for (int i = a; i <= b; i++) {
				sum += i;
			}
			System.out.println(a + "와 " + b + " 사이의 정수의 합은 " + sum + "입니다. ");
	}		
}
