package ch06.book.s060801;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum2(1,2,3);
		System.out.println("result2" +result2);
	}
}
