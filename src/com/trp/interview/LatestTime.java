package com.trp.interview;

public class LatestTime {
	
	public static void main(String[] args) {
	
		
		System.out.println(new LatestTime().maximumTime("1?:??"));
		
	}

	
	  public String maximumTime(String time) {
	        
		  
		  	char prev ='-';
	        char[] a = time.toCharArray();
	        
	        for (int i=0;i<time.length();i++) {
	        		
	        	if (a[i]=='?') {
	        		if (prev=='-' )
	        			a[i]= Character.getNumericValue(a[i+1]) <4 ? '2' : '1';
	        		else if (prev==':')
	        			a[i]='5';
	        		else if ( prev =='2' && i!=time.length()-1) 
	        			a[i]='3';
	        			
	        		
	        		else
	        			a[i]='9';
	        	}
	        	
	        	prev=a[i];
	        	
	        }
	        
	        return String.valueOf(a);
	       
	        
	    }
}
