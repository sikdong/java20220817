package ch11.book;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject1 = "자바 프로그래밍";
		
		int location = subject1.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject1.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
