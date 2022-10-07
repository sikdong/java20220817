package Programmers;

import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		String s = "sdfqwreAsdfB";
		solution(s);
		
	}
	
    public static void solution(String s) {
    	String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        for (String ar : arr) {
        	answer += ar;
        }
        System.out.println(answer);
    }
}
