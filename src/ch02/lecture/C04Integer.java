package ch02.lecture;

public class C04Integer {

	public static void main(String[] args) {
		// 정수 : byte(1), short(2), int(4), long(8)

		// 1 byte == 8bit(0000 0000)
		
		long a  = 30000000000L;
		
		// 정수 literal 작성시 주의 할 점
		// 정수 literal은 int 취급
		// 범위 넘어갈 땐 long 타입으로 표시
		// 작성하는 수가 클 땐 _와 조합 가능
		
		long b = 2_100_000_000;
		
		// 연산 시 overflow 주의
		int s = 2147483647;
		int t = s + 1; 
		System.out.println(t);
		
	}

}
