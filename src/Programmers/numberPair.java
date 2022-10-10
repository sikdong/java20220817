package Programmers;

import java.util.*;

public class numberPair {
	public static String largeNum(String s) {
		String num = "";
		int[] xnum = new int[s.length()];
		for (int i = 0; i < xnum.length; i++) {
			xnum[i] = Integer.parseInt(s.substring(i, i + 1));
		}
		Arrays.sort(xnum);
		for (int i : xnum) {
			num += String.valueOf(i);
		}
		StringBuilder sb = new StringBuilder(num);
		String answer = sb.reverse().toString();
		return answer;
	}
	public static void main(String[] args) {
		String[] arr = {"9", "8", "7", "6", "5", "4" ,"3", "2", "1", "0"};
		String a = largeNum("02827");
		String b = largeNum("28712");
		String answer = "";
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----");
		
		List<String> list = new ArrayList<String>();
		while(true) {
			int i = 0;
			String temp ="";
			for(String item : arr) {
				if(item.equals(a.substring(i,i+1))) {
					temp = item;
				}
			}
			
			for (int j = 0; j < b.length(); j++) {
				if(temp.equals(b.substring(j,j+1))) {
					answer+=temp;
				}
			}
			i++;
			
		}
		
	}
}
