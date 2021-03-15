package com.trp.interview;

public class ReverseString {
	public static void main(String[] args) {
		
		String str = "Rishi";
		
		
		System.out.println(revStr(str));
		
	}

	public static String revStr(String str) {
		
		char[] chr = str.toCharArray();
		
		str = "";
		for (int i= chr.length-1;i>=0;i--)

			str += chr[i];
		
		
		return str;
	}
}
