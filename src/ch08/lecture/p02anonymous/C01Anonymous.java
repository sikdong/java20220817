package ch08.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
		
	
	//인터페이스 구현과 객체 생성을 한 번에
	MyInterface1 o3 = new MyInterface1() {
		@Override
		public void method() {
			System.out.println("재정의한 메소드!!!");
		}
	};

}

//class Myclass1 implements MyInterface1{
//	
//}

interface MyInterface1 {
	void method();
}

}
