package com.inetbanking.demo;

import java.util.Scanner;

import org.testng.annotations.Test;

// BODMAS Rule 
// Priority of operators (), * , /, %, + , - 

public class Day1 {
	
//@Test()
void addUsingScanner() {
	
	
	System.out.println(20-6+4*2);
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println(a+b);
	String message = sc.nextLine();
	System.out.println(message);
	
}
	
	

//@Test

void evenAdd() {
	
	int a=9;
	if(a%2==0) {
		System.out.println("even");
	}
	
	else {
		
		System.out.println("odd");
	}
}



//@Test 

void isVowel() {
	
	String str = "planon";
	
	char[] ch = str.toCharArray();
	
	for( char c : ch) {
		
		switch(c) {
		
		case 'a' : 
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : System.out.println(c + " is vowel ");
			
		
		}
		
	}
	
	
}


//@Test 

void powerOfANumber() {
	
	int a = 2, b=4;
	
	for(int i=1;i<4; i++) {
		
		a=a*2;
		
	}
	System.out.println(a);
}


//@Test

void swapNumbers() {
	
	int a =10 , b=20, temp;
	
	temp = a;
	a=b;
	b=temp;
	
	System.out.println("a=" + a );
	System.out.println("b=" + b );
}


@Test 

void sumofAllDigits() {
	
	
}




	

}
