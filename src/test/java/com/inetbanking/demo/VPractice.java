package com.inetbanking.demo;

import java.util.Vector;

public class VPractice {
	
	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		v1.add("yadagiri");
		v1.add("jeevan");
		v1.add(0,"Raj");
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		Vector v2= new Vector();
		v2.add("Ramesh");
		v2.add("suresh");
		
		v1.addAll(v2);
		System.out.println(v1);
		
	}

}
