package ch03.book;

public class AccuracyExapmle {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		
		System.out.println(result + " 조각이 남는다.");
	}
}
