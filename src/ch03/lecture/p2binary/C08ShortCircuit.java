package ch03.lecture.p2binary;

public class C08ShortCircuit {
	public static void main(String[] args) {
		// short circuit
		// &&, || 발생
		// A && B / A || B 가 있다면 A가 false면 B는 계산하지 않음
		int i = 3;
		if(i<0 && i > -5) {
			System.out.println("A");
		}
		
		//&, | 발생 안함
	}
}
