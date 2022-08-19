package ch03.lecture.p2binary;

public class C07Logical {
	public static void main(String[] args) {
		// 논리 연산자
		// and : &&, &(둘 다 true여야 true)
		// or : ||, | (피연산자 1개만 true 여도 true)
		// xor : ^ (다를때만 true)
		// not : !(true면 false, 결과값 반대로 출력, 단항 연산자)
		// 피연산자가 boolean 결과도 boolean
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
	}
}
