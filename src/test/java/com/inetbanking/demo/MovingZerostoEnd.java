package com.inetbanking.demo;

import java.util.Arrays;

public class MovingZerostoEnd {

 public static void main(String args[]) {
	 
	 int [] numbersArray = {0,1,3,12,0,0,0};
	 int j=0;
	 
	 for(int i=0;i<numbersArray.length; i++) {
		 
		 if(numbersArray[i] !=0) {
			 
			 numbersArray[j]= numbersArray[i];
			 j++;
		 }	 
	 }
	 
	 for(int i=j;i<numbersArray.length;i++) {
		 numbersArray[i]=0;
		 
	 }
	 
	 for(int i=0;i<numbersArray.length;i++) {
		 
		 System.out.println(numbersArray[i]);
	 }
 }
}
