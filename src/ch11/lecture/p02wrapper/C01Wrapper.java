package ch11.lecture.p02wrapper;

public class C01Wrapper {
	public static void main(String[] args) {
		//기본 타입 8개에 매칭되는 참조타입 8개
		String[] arr1 = new String[3];
		arr1[0] = "coyote";
		arr1[1] = "rooster";
		arr1[2] = "iceman";
		
		Integer b = Integer.valueOf(3);
		
		Object[] arr3 = new Object[3];
		arr3[0] = "phonix";
		arr3[1] = Integer.valueOf(99);
		
 	}
}
