package Programmers;

public class giveUpMath {
	public static void main(String[] args) {
		int[] answer = {1,3,2,4,2};
		int[] num1 = { 1, 2, 3, 4, 5 };
		int[] num2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] num3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		boolean go = true;
		int check1 = 0;
		int check2 = 0;
		int check3 = 0;
		int j = 0;
		
		while (go) {
			for (int i = 0; i < num1.length; i++) {
				if (num1[i] == answer[j]) {
					
					check1++;
				}
				j++;
			}
			if (j == answer.length) {
				go = false;
			}
		}
		System.out.println(j);
		System.out.println(check1);
		j = 0;
		while (go) {
			for (int i = 0; i < num2.length; i++) {
				if (num2[i] == answer[j]) {
					
					check2++;
				}
				j++;
			}
			if (j == answer.length) {
				go = false;
			}
		}
		System.out.println(check2);
		j=0;
		while (go) {
			for (int i = 0; i < num3.length; i++) {
				if (num3[i] == answer[j]) {
					
					check3++;
				}
				j++;
			}
			if (j == answer.length) {
				go = false;
			}
		}
		System.out.println(check3);
		
		
	}
}
