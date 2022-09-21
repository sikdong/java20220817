package Programmers;

public class Prac {
	public static void main(String[] args) {
		 String answer ="";
		 String s = "-1 -2 -3 -4";
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < s.length(); i++){
	            if(!s.substring(i, i+1).equals(" ")){
	            min = Math.min(min, Integer.parseInt(s.substring(i, i+1)));
	            max = Math.max(max, Integer.parseInt(s.substring(i, i+1)));
	            }    
			}
	         String strMin = String.valueOf(min);
	         String strMax = String.valueOf(max);
	         answer = strMin + strMax; 
	 
	        System.out.println(answer);
	        System.out.println(max);
	}
}
