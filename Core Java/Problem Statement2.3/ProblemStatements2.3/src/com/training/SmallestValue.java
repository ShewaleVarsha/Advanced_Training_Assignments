package com.training;

	import java.util.*; 
	
	public class SmallestValue {
		
	public static int getSmallest(int[] a, int total){  
	Arrays.sort(a);  
	return a[0];  
	}  
	public static void main(String args[]){  
 
	int a[]={45,27,58,98,17,79,45};
	
		
	System.out.println("Smallest: "+getSmallest(a,7));  
	}
	}  

