package Programmers;

import java.util.Arrays;

public class NumberK {
	public void solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int n = 0;
		for (int i = 0; i < commands.length; i++) {
			int[] numArr = new int[commands[i][1] - commands[i][0] + 1];
			n = 0;
			for (int j = commands[i][0]; j <= commands[i][1]; j++) {
				numArr[n] = array[j - 1];
				n++;
			}
			Arrays.sort(numArr);
			answer[i] = numArr[commands[i][2]];
		}

	}

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		int n = 0;
		for (int i = 0; i < commands.length; i++) {
			int[] numArr = new int[commands[i][1] - commands[i][0] + 1];
			n = 0;
			for (int j = commands[i][0]; j <= commands[i][1]; j++) {
				numArr[n] = array[j- 1];
				n++;
			}
			Arrays.sort(numArr);
			System.out.println(numArr[0]);
			answer[i] = numArr[commands[i][2]-1];
		}
	}
}
