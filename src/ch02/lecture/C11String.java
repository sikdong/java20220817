package ch02.lecture;

public class C11String {
	public static void main(String[] args) {
		// String : 문자열
		// char : 문자
		
		char a = '뀗';
		String b = "java";
		String c = ""; // 빈 문자열도 가능
		
		// + (연결연산)의 결과는 String
		String d = "hello";
		char e = '!';
		String f = d + e;
		System.out.println(f); //hello!
		
		String g = d + 100;
		System.out.println(g); //hello100
		
		// 참조 타입 (객체) ; 필드와 메소드가 있음
		String k = "bts";
		char l = k.charAt(1); // charAt 메소드
		int m = k.charAt(2); // 자동 형 변환도 가능
		
		char n = k.charAt(0); // 'b'
		char o = k.charAt(1); // 't'
		
//		k.charAt(-1); // IndexOutofBoundsException 던져짐(발생)
		
		// length : 길이 리턴
		
		int q = k.length();
		System.out.println(q);
		
		// substring
		String r = "javascript";
//		String s = r.substring(i); //i번째 인덱스 부터 끝까지
//		System.out.println(s);
		
		// substring(int, int)
		
		System.out.println(r.substring(0,4));
		System.out.println(r.substring(2,4));
		
		
	
	
	}
	
}
