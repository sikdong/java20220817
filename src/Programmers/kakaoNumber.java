package Programmers;

public class kakaoNumber {
	public static void main(String[] args) {
		String[] num = {"one","two","three","four","five","six","seven","eight","nine","zero"};
		String s = "onetwothree";
		StringBuilder sb = new StringBuilder(s);
		String strAns = "";
		for (int i = 0; i < sb.length(); i++) {
			if(sb.substring(i, i+3).equals(num[0])) {
				strAns += 1;
				sb.delete(i, i+3);
			}
			if(sb.substring(i, i+3) == num[1]) {
				strAns += 2;
				sb.delete(i, i+3);
			}
		}	
		System.out.println(strAns);
		System.out.println(sb);
//			if(sb.substring(i, i+5) == num[2]) {
//				strAns += 3;
//				sb.delete(i, i+5);
//			}
//			
//			if(sb.substring(i, i+4) == num[3]) {
//				strAns += 4;
//				sb.delete(i, i+4);
//			}
//			else {
//				strAns +=sb.substring(i,i+1);
//			}
//		}
//		System.out.println(strAns);
	}
}
