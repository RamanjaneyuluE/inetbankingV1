package com.inetbanking.demo;


	
	class A {
		void method1() {
			System.out.println("A - Method1");
			method2();
		}
		
		void method2() {
			
		  System.out.println("A- Method2");
		}
	}
	
	class B extends A {
		void method1()
		{
			System.out.println("B - Method1");
			super.method1();
			
		}
		
		void method2() {
			
			  System.out.println("B- Method2");
			}
	}	
		
	public class InheritanceConcept {

	public static void main(String[] args) {
		
        A obj= new B();
        obj.method1();
	}

}
