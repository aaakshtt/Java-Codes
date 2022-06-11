package com.akshat;
//Java program to demonstrate
//working of Arrays.toString()
import java.util.Scanner;
class problems {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 int[] arr = {1,3,5,7,9,14,2,5,1,74,2,1,9,1,56,8,1,6,9,8};
		 //System.out.println("Print the maximum");	
		 minimum();
	}
	static int minimum() {
		int[] arr = {121,3,5,7,9,14,2,5,1,74,2,1,9,1,56,8,0,-3,9,8};
		int min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		return min;
		
	}	
		}
		
	
	


	



	


