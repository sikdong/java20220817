package ch04.lecture;

import java.util.Scanner;

public class C18GuessNumber {
	public static void main(String[] args) {
		// 컴퓨터 1~100 random
		// ctrl + shift+ o : import 추가
		Scanner scanner = new Scanner(System.in);
		int a = (int) (Math.random() * 100) +1;
		System.out.print("번호를 입력하세요: ");
		int user = scanner.nextInt();
		System.out.println(a);
		
		while(user != a) {
		System.out.println("틀렸습니다");
		System.out.println("번호를 입력하세요");
		scanner.nextInt();
		System.out.println(a);
			if(user != a) {
				continue;
			
		} 
	}
		System.out.println("맞췄습니다!");
}
}