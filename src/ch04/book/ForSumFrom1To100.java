package ch04.book;

public class ForSumFrom1To100 {
	public static void main(String[] args) {
		
	int sum = 0;
	
	int i = 0;
	
	for(i=1; i<=100; i++) {
		sum += 1;
	}
	
	System.out.println("1~" + (i-1) + " 합 : " + sum);
	
}
}
