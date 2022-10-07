package Programmers;

public class Solution6 {
	public static void main(String[] args) {
		
	}
    public int toThree(int n) {
        int answer = 0;
        int num = 0; // 답이 될 숫자
        int exp = 1; // 지수는 exponent
        String str = ""; //0이 붙을 string
        while(num <= n){
            answer = num;
            if(num == 3 * exp){ 
                str += "0";
               exp *= 3;
                }
            num++;
            } 
               num++;
        return answer;
    }
}
