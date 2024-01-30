package com.inetbanking.demo;

public class VowelsConsonants {

	public static void main(String[] args) {
		
		String str = "Rama";
		int vcount = 0;
		int ccount=0;
		
		char[] ch = str.toCharArray();
		
		for(char k : ch) {
			
			if(k=='a' || k=='e' ||  k=='i' || k=='o' || k=='u') {
				
				vcount = vcount +1 ;
				
				
			}
			
			else  {
				
				ccount = ccount + 1 ;
				
				
			}
			
			
		}
		
		System.out.println("Vowels = " + vcount);
		System.out.println("Consonants = " + ccount);
	}

}
