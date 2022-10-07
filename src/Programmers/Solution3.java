package Programmers;

public class Solution3 {
    public static int solution(int p, int m, int c) {
        long answer = -1;
        int n = p;
        for (int i = 1; i <= c; i++){
            p +=n*i;
        }
        return p;
    }
    
    public static void main(String[] args) {
		System.out.println(Solution3.solution(3,1,4));
	}
}
