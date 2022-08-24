package ch05.lecture.p01array;

public class C06Array {
	public static void main(String[] args) {
		int[] arr1 = {9,8};
		int[] arr2 = {100, 50};
		int[] arr3 = {9,8,7};
 		
		printFirstItem(arr1);
		
		printLastItem(arr1);
		
		printMiddleItem(arr1); //8
		printMiddleItem(arr2); //50
	}
	
	public static void printFirstItem(int[] arr) {
		System.out.println(arr[0]);
	}
	public static void printLastItem(int[] arr) {
		System.out.println(arr[arr.length-1]);
	}
	
	public static void printMiddleItem(int[] arr) {
		System.out.println(arr[arr.length/2]);
	}
	
}
