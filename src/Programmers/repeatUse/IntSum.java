package Programmers.repeatUse;

public class IntSum {
	//String으로 된 숫자가 나오는 경우 숫자의 자리수 합 구하는 방법
	public int intStringSum(int n) {
		int sum = 0;
		String answer ="";
		String nString = String.valueOf(n);
		for (int i = 0; i < nString.length(); i++) {
			sum += Integer.parseInt(nString.substring(i, i+1));
		}
		return sum;
	}
}
