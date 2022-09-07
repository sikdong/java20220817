package Programmers;


import java.util.*;

public class NumberOfSeat {
	public static void main(String[] args) {
	
	    	int n = 123;
	        int answer = 0;
	        String str = Integer.toString(n);
	        for (int i = 0; i < str.length(); i++){
	            answer += str.charAt(i);
	        }

	        System.out.println(answer);
	    
		}
	}

