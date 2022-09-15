package programming.hiding;

import java.util.*;

public class Leetcode1200 {
	public static void main(String[] args) {
		int arr[] = {4,2,1,3};
	        Arrays.sort(arr);
	        List<Integer> list1 = new ArrayList<>();
	        List<List<Integer>> list2 = new ArrayList<>();
	        int min = Integer.MAX_VALUE;
	        for (int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr.length; j++){
	                if(arr[i] < arr[j]){
	                   min = Math.min(min, (arr[j]-arr[i]));
	                }       
	            } 
	        }
	        
	        for (int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr.length; j++){
	                if((arr[i] < arr[j])&&(arr[j] - arr[i] == min)) {
	                   list1.add(arr[i]);
	                    list1.add(arr[j]);
	                    list2.add(list1);
	                              
	                }
	            } 
	        }
	        
	       System.out.println(list2);

	        }
	        
	        }
	        
