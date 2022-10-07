package Programmers;

public class Solution1 {
	public static void main(String[] args) {
	int a = sum(15);
	System.out.println(a);
		
	}

	public static int sum(int n) {
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}
