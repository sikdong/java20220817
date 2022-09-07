package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing {
	public static void main(String[] args) {
		Integer a = 99;
		
		//참조 타입을 기본타입으로 변경
		int b = a.intValue();
		
		//참조 타입을 기본타입으로 자동 변경
		int c = a;
	}
}
