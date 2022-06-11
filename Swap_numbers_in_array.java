package com.akshat;
//Java program to demonstrate
//working of Arrays.toString()
import java.util.Scanner;
class problems {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 int[] arr = {1,3,5,7,9,14,2,5,1,74,2,1,9,1,56,8,1,6,9,8};
		 System.out.println("Enter the two indexes");
		 int i =sc.nextInt();
		 int j = sc.nextInt();
		 swap(arr, i, j);
		
	}
	static void swap(int[] arr, int i, int j) {
		System.out.println("Intial two arrays include  " + arr[i] +"    "+ arr[j]);
		int temp = arr[i];
		arr[i]  = arr[j];
		arr[j] = temp;
		System.out.println("Intial two arrays include  " + arr[i] +"   " + arr[j]);
	}
}

	



	


