package Programmers;

public class Solution4 {
	 public static void solution(String s) {
	        String answer = "";
	        String[] arr = s.split(" ");
	        for (int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr[i].length(); j++){
	                if(j%2 == 0){
	               String str = arr[i].substring(j, j+1).toUpperCase();
	                    }
	            }
	            
	        }
	            System.out.println(arr[0].substring(0,1));
	        }
//	        for (String item : arr){
//	            answer += item;
//	        }
//	        return answer;
//	    }
//	 
	public static void main(String[] args) {
		solution("try hello world");
	}
}
