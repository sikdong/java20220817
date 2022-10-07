package Programmers;

import java.util.*;

public class numberPair {
	
public static String largeNum(String s) {
	String num = "";
	int[] xnum = new int[s.length()];
	for (int i = 0; i < xnum.length; i++) {
		xnum[i] = Integer.parseInt(s.substring(i, i+1));
		}
	Arrays.sort(xnum);
	for(int i : xnum) {		
		num += String.valueOf(i);
	}
	StringBuilder sb = new StringBuilder(num);
	String answer = sb.reverse().toString();
	return answer;
}

public static String answer(String a, String b) {
	List<String> list = new ArrayList<String>();
	for(int i = 0; i < a.length(); i++) {
		list.add(a.substring(i, i+1));
	}
	
	for(int i = 0; i < b.length(); i++) {
		list.add(b.substring(i, i+1));
	}
	String temp = "";
	String sol = "";
	for(String item : list) {
		sol += item;
		temp = item;
		if(temp.equals(item)) {
			list.remove(item);
			list.remove(temp);
		}
	}
	return sol;
}

public static void main(String[] args) {
	String a = largeNum("100");
	String b = largeNum("123450");
	
	List<String> list = new ArrayList<String>();
	for(int i = 0; i < a.length(); i++) {
		list.add(a.substring(i, i+1));
	}
	
	for(int i = 0; i < b.length(); i++) {
		list.add(b.substring(i, i+1));
	}
	
//	for(String s : list) {
//		System.out.println(s);
//	}
	String temp = "";
	String sol = "";
	for(int i = 0; i < list.size(); i++) {
		
		}
	}
	
	for(String s : list) {
		System.out.println(s);
	}
}
	


}	
