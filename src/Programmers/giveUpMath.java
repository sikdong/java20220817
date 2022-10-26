package Programmers;

public class giveUpMath {
	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,5};
		int[] num2 = {2,1,2,3,2,4,2,5};
		int[] num3 = {3,3,1,1,2,2,4,4,5,5};
		
		
	}
	
	public int searchMyself(int[] num, int[] n) {
		int solution = 0;
		int cnt = 0;
		for(int i = 0; i < num.length; i++) {
			cnt++;
			if(num[i]==n[i]) {
				solution++;
			}
		}
		if(cnt != n.length) {
			searchMyself(num, n);
		} else {
			
			return solution;
		}
		
	}
	
}
