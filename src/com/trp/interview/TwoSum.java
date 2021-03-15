package com.trp.interview;


import java.util.Arrays;

public class TwoSum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,7,2,9,33,4,8,1};
	
		int sm=13;
		
		//Arrays.parallelSort(arr);
		
	//	for (int s: arr)
	
//		System.out.println(s);
		
		int size = (int) Math.ceil(arr.length/2);
		
		System.out.println(size);
		
	
		int ind[] = new TwoSum().approach1(arr,sm);
		
		for(int k: ind)
			System.out.println(k);
		
	//	int  indexes[] = rec(size,arr[]);
	
		
		
	}
	
	
	
	public int[] approach1(int[] arr, int sm) 
	{
		
		for (int i=0;i<arr.length;i++) {
			
			for (int j=i+1;j<arr.length;j++) {
				
				if (arr[i]+arr[j] == sm)
					return new int[] {i,j};
				
			}
			
		}
		
		return null;
	}
	
	public int[] approach2(int[] arr, int sm) 
	{
		
		
		for (int i=0;i<arr.length;i++) {
			
			for (int j=i+1;j<arr.length;j++) {
				
				if (arr[i]+arr[j] == sm)
					return new int[] {i,j};
				
			}
			
		}
		
		return null;
	}
	
/*	
	public int[] rec(int size,int arr[],int sm)
	{
		if (arr[size]+ arr[size-1] < sm)
		{
			size = (int) Math.ceil(arr.length/2);
			rec(size,arr,sm);
		}
	}
	
/*	public int[] ret(int[] arr,int sm)
	{
		
		int [] res;
	
		
		
		
		return res;
				
	}
	
*/
}
