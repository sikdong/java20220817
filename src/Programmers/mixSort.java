package Programmers;

import java.util.*;

public class mixSort {

	public static void main(String[] args) {
		String[] str = {"abce", "abcd", "cdx"};
		int n = 2;
		int i = 0;
		int[] numArr = makeint(str, n);
		for(int a : numArr) {
			System.out.println(a);
		}
		String[] answer = new String[str.length];
 		for (int num : numArr) {
			for (String s : str) {
				if ((int) s.charAt(n) == num) {
					answer[i] = s;
					i++;
				}
			}
		}
	} 		
// 		for (String s : answer) {
// 			System.out.println(s);
// 		}

	public static int[] makeint(String[] strings, int n) {
		String[] answer = new String[strings.length];
		int[] temp = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			temp[i] = (int) (strings[i].charAt(n));
		}
		Arrays.sort(temp);
		return temp;
	}
	// 1. 먼저 비교하는게 필요함 n 자리의 글자를 뽑고 맞으면 지워서 다시 add
	// 2. n 자리의 숫자가 같다면 그 해당 글자를 처음부터 조회하는게 필요함
	
}
 
