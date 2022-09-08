package ch11.lecture.p04regex;

public class C01regex {
	public static void main(String[] args) {
		//regular expression(regex)
		//정규표현식, 정규식표현
		//문자열의 패턴을 표현하는 코드(문자열)
		
		String str1 = "a";
		String pattern1 = "a";
		
		System.out.println(str1.matches(pattern1));
		
		String s2 = "b";
		String p2 = "b";
		System.out.println(s2.matches(p2));
		
		String s4 = "bbb";
		String p4 = "b+"; //+: 한개 이상
		
		System.out.println(s4.matches(p4));
		
		String p5 = "b*"; // * : 0개 이상
		
		String p6 ="dog";
		System.out.println("dog".matches(p6));
		
		String p7 = "do+g";
		System.out.println("dog".matches(p7));
		System.out.println("dooooooog".matches(p7));
		
		String p8 = "[abcd]"; // [] : 안에 나열된 문자 중 하나, 대소문자 구별, 조합은 안됨
		
		
		String p10 = "[a-zA-Z]"; //a~z , A~Z까지
		
		System.out.println("abc".matches("[a-c]+"));
		
		String p11 = "[^abcdefghijkl]"; // [^] 제외하고
		
		String p13 = "d[^o]+g";
		System.out.println("dog".matches(p13));
		System.out.println("dag".matches(p13));
		
		//수량
		// + : 1개 이상
		// * : 0개 이상
		// ? : 0개 또는 1개
		// {n} : n개 
		// {n,} : n개 이상
		// {n, m} : n개 이상 m개 이상
		
		
		//기호
		// . : 모든 글자
		// \d : [0-9];
		// \w : [a-zA-Z0-9] (word character)
		// \s : 공백(스페이스, 엔터, 탭)
		// ^ : 한줄의 시작
		// & : 한줄의 끝
		
		String p18 = ".";
		
		String p19 = "\\d"; //자바에서 \는 \\로 작성
		
		System.out.println("0".matches(p19));
		System.out.println("5".matches(p19));
		System.out.println("".matches(p19)); //false
		System.out.println("91".matches(p19)); // false
		
		// () : 그룹
		// | : or 또는 
		String p22 = "(dog|cat)";
		System.out.println("dog".matches(p22));
		System.out.println("cat".matches(p22));
		
		
		// \. : .(dot);
		String p25 = "\\.";
		System.out.println(".".matches(p25));
				
		
		
				
	}
}
