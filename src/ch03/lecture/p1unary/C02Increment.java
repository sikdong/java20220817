package ch03.lecture.p1unary;

public class C02Increment {
	public static void main(String[] args) {
		// ++ :  증가 연산자
		// -- :  감소 연산자
		
		int i = 10;
		int j = 10;
		
		int k = ++i; // 연산결과는 11, i가 11이 됨
		int l = j++; // 연산결과는 10, j가 11이 됨
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(k);
		System.out.println(l);
		}
	}
