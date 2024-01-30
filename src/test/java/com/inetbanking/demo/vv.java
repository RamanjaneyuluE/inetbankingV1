package com.inetbanking.demo;

import java.util.HashMap;

public class vv {

	public static void main(String[] args) {
		
		String str = "statestreet";
		
		
		HashMap<Character, Integer> map = new HashMap<>();
			
		for(int i=0;i<str.length();i++) {
			
			char k=str.charAt(i);
			
			if(map.containsKey(k)) {
				
				int x = map.get(k);
				map.put(k, x+1);
			}
			
			else {
				
				map.put(k, 1);
				
			}
		}
		
		
		System.out.println(map);
		

	}

}
