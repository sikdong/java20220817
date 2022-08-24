package ch05.lecture.p01array;

public class C08Array {
	// 04이차배열.png 참고
	public static void main(String[] args) {
		int[] a = {4,5,6};
		int[][] b; // item의 타입이 int[]
		
		b = new int[][] {{1,2},{100,200},{5,6}};
		
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
	}
}
