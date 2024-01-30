package com.inetbanking.demo;

public class FirstletterCapital {
	
	
	public static String capitalize(String str) {
		
		String str1= str.substring(0, 1).toUpperCase();
		String str2 = str.substring(1);
		String str3 = str1 + str2 ;
		return str3;
	}
	
	public static void capitalize1(String str) {
		
		String[] arr= str.split(" ");
		for(int i=0; i<arr.length; i++) {
			
			String str1=arr[i].substring(0, 1).toUpperCase();
			String str2=arr[i].substring(1);
			String str3= str1+str2;
			System.out.print(str3 + " ");
			
			
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		String str = "planon aoftware bolutions" ;
		
		capitalize1(str);
		
		//System.out.println(capitalizeString);
		

	}

}
