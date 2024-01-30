package com.inetbanking.demo;

public class CountWordsInAString {
	static String str ;
	static int wordCount=1;
	
	
	public static void main(String[] args) {
		
		str = "Welcome to Planon software solutions";
		
		//method1();
		method2();
		
		
	}

	public static void method1() {
		
		String str1[] = str.split(" ");
		for(String string : str1) {
			
			wordCount=wordCount + 1 ;
		}
		
		System.out.println("Words in a String =" + wordCount);
	}
	
	
	public static void method2() {
		
		for(int i=0;i<str.length()-1;i++) {
			
			if((str.charAt(i)== ' ') && (str.charAt(i+1)!= ' ')) {
				wordCount=wordCount + 1 ;
				
			}
			
			
		}
		
		System.out.println("Words in a String =" + wordCount);
	}
	
	
	

}
