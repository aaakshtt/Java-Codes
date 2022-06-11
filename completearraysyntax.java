package com.akshat;
import java.util.Arrays;
import java.util.Scanner;
public class arrays1 {
				
	public static void main(String[] args) {
//		//Syntax of Arrays
//		// datatype[] variable_name  = new datatype[size];
//		
//		//or
//		// datatype[] roolnos = {1,2,3,4,5} 
//		 int[] rollno = {1,3,4,5,5};
		
	
		//array1();			//Launch method 1
		//array2(); 		//Launch array 2
		//array3();			//Launch array3
		//array4();     //Launch array 4 method
		
	}
		static void array1() {				//MEthod 1
		 int[] roll;//declaration of an array
		 //roll = new int[5];		//object creation or intialization
		 int[] rollno = {12,13,14,15,6};
		 System.out.println(rollno[1]);	
		 for(int i =0;i<rollno.length;i++) {
			 System.out.println(rollno[i]);
		 }
		}
		
		static void array2() {				//Method 2
			int[] arr = new int [3];
			arr[0] = 12;
			arr[1] = 134;
			arr[2] = 256;
			arr[3] = 128;
			System.out.println(arr[2]);
			
		}
		
		
		static void array3() {			//Method 3
			Scanner sc = new Scanner(System.in);
			int [] arr  = new int[5];
			for(int i =0;i<arr.length;i++) {
				System.out.println("Enter the next Integer");		//Create an array by taking user input
				arr[i]   = sc.nextInt();
			}
			
			
			//Print array method 1
//			for(int i =0;i<arr.length;i++) {						//print all of the array
//				System.out.println(arr[i]);
//			}
			
			
			//Print array method 2
//			for(int num : arr) {									//For every element in the array , print the element
//				System.out.println(num + "  ");						//num represents the element of the array
//			}
			
			
			//Another way to print any array
			System.out.println(Arrays.toString(arr));
		}
		
		static void array4() {							//Array of objects Method 4
			Scanner in  = new Scanner(System.in);
			String[] str = new String[4];				
			for(int i =0;i<str.length;i++) {
				str[i] = in.next();
			}
			for(int i =0;i<str.length;i++) {
				System.out.print(str[i] + "   ");
			}
			
		}
	

}
