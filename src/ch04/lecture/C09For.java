package ch04.lecture;

public class C09For {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("---------------");
		
		for (int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for(int j = 5; j >= 1 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for(int j =0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 1; i < 6; i++) {
			for(int j =1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for(int j =0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i <= 5; i++) {
			for(int j =0; j <(5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
			}
				System.out.println();
		}		
		for (int i = 0; i < 5; i++) {
			//space 출력 
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int s = 5; s > i; s--) {
			System.out.print("*");
		} 
			System.out.println();
			System.out.println("==========");
		}	
			int r = 0;
			for (int i = 0; i < 5; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print((r % 10));
					r++;
				}
				System.out.println();
			}
			
			
		}
	}
	
