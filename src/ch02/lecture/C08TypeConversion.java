package ch02.lecture;

public class C08TypeConversion {
	public static void main(String[] args) {
		// 타입 변환
		// 작은 타입에서 큰 타입으로 자동 변환
		// 큰 타입에서 작은 타입으로는 강제 변환(casting)
		
		// 자동 형 변환
		int a = 33;
		short b = 55;
		
		a = b; // 자동 형 변환
		
		char c = '가';
		
//		short e = c; //안됨

		//정수형 -> 실수형
		int h = 999;
		float i = h;
		double j = h;
		long k = 9999L;
		float l = k;
		
		// 강제 형변환(큰 타입 -> 작은 타입)
		long q = 999999;
//		int p = q; // x
		int r = (int) q; // 강제형변환(casting)
		
		q = 30_0000_0000L;
		r = (int) q;
		System.out.println(r);
		//값을 잃을 수 있다
		
		//실수 -> 정수 (강제형 변환)
		float s = 3.14F;
		int t = (int)s; // 3이 나옴
		
		
	}
}
