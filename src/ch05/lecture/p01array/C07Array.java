package ch05.lecture.p01array;

public class C07Array {
	public static void main(String[] args) {
		int[] arr1 = {-5,-4,-3};
		int[] arr2 = {4, 5, 6, 7};
		int[] arr3 = {300, 200, 100, 50, 40};
		
		int s1 = sumFirstLast(arr1);
		System.out.println(s1); // -8
		int s2 = sumFirstLast(arr2);
		System.out.println(s2);
		int s3 = sumFirstLast(arr3);
		System.out.println(s3);
	}
	
	private static int sumFirstLast(int[] arr1) {
		return arr1[0] + arr1[arr1.length-1];
	}

}
