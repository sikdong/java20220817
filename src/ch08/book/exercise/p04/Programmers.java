package ch08.book.exercise.p04;

public class Programmers {
	public static void main(String[] args) {
        int[] answer = new int[2];
        int i = 0;
        int n = 3;
        int m = 12;
        		
        for (i = 1; i <= n; i++){
            if((n%i == 0) && (m%i == 0)){
                answer[0] = i;
                System.out.println(i);
            }   
                
//            int a = n/i;
//            int b = m/i;
//                answer[1] = a * i * b;    
            System.out.println(i);        
            }
        System.out.println(i);
        }
}
 
