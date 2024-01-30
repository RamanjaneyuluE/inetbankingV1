package com.inetbanking.demo;

public class CharArraytoString {
	
	
	static StringBuffer sb = new StringBuffer();
	static String str ;
	public static void main(String[] args) {
		
		char[] ch={'p','l','a','n','o','n'};
		
	
		
		for (char k : ch)
		{
	
		sb.append(k);
		
		}
		// Approach1
		str = new String(ch);
		System.out.println(str);
		
		
		// Approach2 
		System.out.println(sb);
		
		
	
	}
	
	
	

}
