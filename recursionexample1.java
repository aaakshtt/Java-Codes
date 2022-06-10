package com.akshat;
//Java program to demonstrate
//working of Arrays.toString()

import java.io.*;
import java.util.*;

class helloworld {
	public static void printnum(int n) {
		if(n==0) {					//Base case
			return;
		}
		System.out.println(n);
		printnum(n-1);				//Call the function agin by decreasing the value of n
	}
	public static void main(String[] args)		//Syntax of function
	{
		int n =5;
		printnum(n);  	
		
//		1.First we print 5								n=5
//		2.Then the value of n is changed to n-1			n=4
//		3.Again the function is executed				n=4
//		4.Again the value of n becomes n-1				n=3
		}
	}



	


