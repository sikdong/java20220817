package ch04.book;

public class IfElseIfExample {
	public static void main(String[] args) {
		int score = 90;
		
		if(score>=90) {
			System.out.println("점수가 100-90 입니다.");
			System.out.println("A등급입니다");
		} else if (score>=80) {
			System.out.println("점수가 80 =89 입니다.");
			System.out.println("B등급입니다.");			
		} else if (score>=70) {
			System.out.println("점수가 70-79점 입니다.");
			System.out.println("C등급입니다.");
		}  
		    System.out.println("점수가 70 미만 입니다.");
			System.out.println("D등급입니다.");
	
	}
}