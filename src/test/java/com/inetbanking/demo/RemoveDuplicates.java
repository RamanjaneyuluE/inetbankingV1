/* Remove duplicate characters in a string 
 *  We use set implemented class to achieve this since set will not allow duplicate characters .
 */

package com.inetbanking.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String str = "coconut";
		StringBuffer sb = new StringBuffer();
		
		HashSet<Character> set = new LinkedHashSet<>();
		
		for(int i =0; i< str.length(); i++) {
			
			set.add(str.charAt(i));
		}
		
		for(char ch : set ) {
			
			sb.append(ch);
		}
		
		System.out.println(sb);
	}

	
	
}
