package Programmers;

class Solution5 {
    public static void solution(String s) {
        String answer = "";
    	String[] arr = s.split(" ", -4);
        for (String ar : arr) {
        	System.out.println(ar);
        	System.out.println(arr.length);
        }
    }
//        int cnt = 1;
//        for (int i = 0; i < arr.length; i++) {
//        	for(int j = 0; j < arr[i].length(); j++) {
//        		if(j%2 == 0) {
//        			answer += arr[i].substring(j, j+1).toUpperCase(); 
//        		} else {
//        			answer += arr[i].substring(j, j+1).toLowerCase();
//        		}
//        	}
//        	if(cnt != arr.length && s.contains(" ")) {
//        		answer += " ";
//                cnt++;
//        	}
//        }
//       
//        if (s.substring(s.length()-1, s.length()).equals(" ")) {
//        	answer +=" ";
//        }
//        return answer;
//    }    
    public static void main(String[] args) {
    		solution(" abc   abc ");
   
	}

}
