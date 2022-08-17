package ch02.lecture;

public class C06Double {

	public static void main(String[] args) {
			// 실수형
			// float (4bytes)
			// double (8bytes)
		// double이 float 보다 큰 범위, 더 정교한 표현 가능
		// 실수 literal은 double형
		// float literal 표현은 끝에 F 붙임
		
		double a = 3.14;
		double b = 0.1981293789;
		
		float c = 3.14F;
		float d = 0.12398082389324F;
		
		double f = 0.1; //2진법으로 저장됨
		System.out.println(f);
		
		double g = 0.3;
		
		double h = f + g;
		System.out.println(h); // 실수 연산은 근사값으로 나옴
	}

}
