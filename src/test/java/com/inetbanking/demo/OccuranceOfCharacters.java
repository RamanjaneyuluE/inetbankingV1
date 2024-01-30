package com.inetbanking.demo;
import java.util.HashMap;
public class OccuranceOfCharacters {
	
	public static void main(String[] args) {
		
		String str ="Rama";
		
		char[] ch = str.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char k : ch){
			
			if(!map.containsKey(k)) 
			
			{
				
				map.put(k, 1);
						
			}  
			
			else {
				
				int cnt = map.get(k);
				
				map.put(k,cnt+1);
			}
		}
		
		System.out.println(map);
	}

}
