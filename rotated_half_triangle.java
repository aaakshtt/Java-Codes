package com.akshat;
//Java program to demonstrate
//working of Arrays.toString()

import java.io.*;
import java.util.*;
import java.util.Scanner;
class problems {
	public static void main(String[] args){
		int n= 4;
		for(int i=1;i<=n;i++) {
			//inner loop
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		}
	}
	



	


//    *
//   **
//  ***
// ****