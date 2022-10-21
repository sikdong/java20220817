package Programmers;

public class SecretMap {
	
	public static String 더하기0(int i, int n) {
		int a = i - Integer.toBinaryString(n).length();
		String s ="";
		if (a > 0) {
			for(int j = 1; j <=a; j++) {
				s += "0";
			} 
		}
		s += Integer.toBinaryString(n);
		System.out.println(s);
		return s;
	}
	
	public static String 샵추가(int n, String i, String j) {
		String s = "";
		int c = 0;
			for (int b = 1; b <= n; b++) {
				if(i.substring(c, c+1).equals(" ") &&
						j.substring(c,c+1).equals(" ")) {
					s+=" ";
				}
				s +="#";
				c++;
			}
			return s;	
		}
	
	public static void main(String[] args) {
		System.out.println(더하기0(5, 9));
		System.out.println(샵추가(5, 더하기0(5, 9), 더하기0(5, 30)));
		System.out.println(Integer.toBinaryString(10));
	}
}
