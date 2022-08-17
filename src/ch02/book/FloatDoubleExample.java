package ch02.book;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 실수 값 저장
		double var1 =3.14;
//		float var2 = 3.14;
		float var3 = 3.14F;
		
		//정밀도 테스트
		
		double var4 = 0.123456789;
		float var5 = 0.12341567498F;
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}

}
