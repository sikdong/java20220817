package ch04.lecture;

import java.util.Scanner;

public class C15Scanner {
	public static void main(String[] args) {
		String src = "hello my javascript";
		Scanner scanner = new Scanner(src);
		
		String t1 = scanner.next();
		System.out.println(t1);
		
		String t2 = scanner.next();
		System.out.println(t2);
		
		String t3 = scanner.next();
		System.out.println(t3);
		
		String src2 = "123 456 789";
		scanner = new Scanner(src2);
		
		String t4 = scanner.next();
		System.out.println(t4);
		
		int li = Integer.valueOf(t4);
		System.out.println(li);
		
		System.out.println(li*2);
		
		int i2 = scanner.nextInt();
		System.out.println(i2);
		
		String src3 = "hello world\nhello java\nhello spring";  // \n : new line
		System.out.println(src3);
		scanner = new Scanner(src3);
		
		String line1 = scanner.nextLine();
		System.out.println(line1);
		
		System.out.println("사용자 입력 받기");
		scanner = new Scanner(System.in);
		
		String input1 = scanner.next();
		
		System.out.println("입력한 첫번째 토큰: " +input1);
		
		int input2 = scanner.nextInt();
		
		System.out.println("입력한 두번째 토큰(정수): " + input2);
		
//		scanner.nextLine();
		String input3 = scanner.nextLine();
		System.out.println("입력한 한줄: " + input3);
		
	}
}
