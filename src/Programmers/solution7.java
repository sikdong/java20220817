package Programmers;

public class solution7 {
	public static void main(String[] args) {
		char a = 'z';
		char c = 'Z';
		char f = 'A';
		char g = 'a';
		int b = (int) f + 1;
		String e = String.valueOf(b);
		char z = e.charAt(0);
		int y = (int) a;
		int d = (int) c;
		int h = (int) f;
		int i = (int) g;
		char space = ' ';
		int x = (int)space;
		System.out.println(b);
		System.out.println("Z는" + d);
		System.out.println(e);
		System.out.println(h);
		System.out.println(i);
		System.out.println(z);
		System.out.println("z는" + y);
		System.out.println(space);
		System.out.println(solution("P", 15)); //result "E" 나와야 함
		//A : 65, Z : 90,  a: 97,  z : 122
		System.out.println(x);
	}
	
    public static String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (char item : arr){
            if(item == ' '){
                answer += String.valueOf(item); 
            } else if(item == 'z' || item =='Z'){
                int numz = (int) item -26 + n; //아스키코드 에 n더해서 int에 저장
                char alphabetz = (char) numz;
                answer += String.valueOf(alphabetz);
            } else {
            int numChar = (int) item + n; //아스키코드 에 n 더해서 int에 저장
            char alphabet = (char) numChar;
            answer += String.valueOf(alphabet);
        }
    }      
        return answer;
    }
}
