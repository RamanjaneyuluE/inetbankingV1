package com.inetbanking.demo;

public class StringToCharArray {

	public static void main(String[] args) {
		
		//String str = new String("Planon");
		
		String str = "planon" ;
		
		char[] ch =  str.toCharArray();
		
		System.out.println(ch);
		System.out.println(ch[0]);
		
		for (char k: ch) {
			
			System.out.println(k);
		}
	}
	
	
	          
}
