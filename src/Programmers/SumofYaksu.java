package Programmers;

public class SumofYaksu {
	public static void main(String[] args) {
		
			int n = 12;
	        int answer = 0;
	        int cnt = 0;
	        for (int i = 1; i <= n; i++){
	            for(int j = 1; j <= n; j++){
	                if((i < j) && ((i * j) == n)){                    
	                    ++cnt; 
	                } else if ((i == j) && ((i * j) == n))
	                    ++cnt;
	            }
	        }
	        int[] arr = new int[cnt];
	        arr[0] = 1 + n;
	         for (int s = 1; s < cnt; s++){
	         for (int i = 1; i <= n; i++){
	            for(int j = n; j >= 1; j--){
	                if(((i * j) == n) && ((i+j) != arr[0])){                    
	                    arr[s] = i + j;
	                } else if ((i == j) && ((i * j) == n))
	                    arr[s] = i;
	                }      
	            }
	        }
	        
	        for(int i = 0; i < arr.length; i++){
	            answer += arr[i];
	        }
	        System.out.println(answer);
	    }
	}

