package ch04.book;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); 
			// 코드블록이 위에서 끝났기 때문에 if 문과 상관 없이 실행 
		
	}
}
