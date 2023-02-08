package akshat2;
import java.lang.Math;
import java.lang.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;
import java.util.Scanner;
public class Solution {
	public static void main(String args[]) {
	int[] numbers = {2,4,6,8,12}	;
	Araycc as = new Araycc();
	as.printsubarrays(numbers);
}
}
	 class Araycc{
		static void printsubarrays(int numbers[]) {
			int ts = 0;
			int sum = 0;
			int maximum =0;
			int minimum =1000;
		
			for(int i = 0;i<numbers.length;i++) {
				int tempmax;
				int max;
				
				int start = i;
				for(int j=i;j<numbers.length;j++) {
					int end = j;
					for(int k =start;k<=end;k++) {		//Print all the elements between start and end
						System.out.print(numbers[k] +" ");		//Subarray
						sum = sum +numbers[k];
						int currentsum =sum;
						if(currentsum>maximum) {
							maximum = currentsum;
						}
						if(currentsum<minimum) {
							minimum = currentsum;
						}	
					}
					System.out.print("The sum of array is " + sum);
					ts++;
					sum = 0;
					System.out.println();
				}
				sum= 0;
				System.out.println();
				
			}
			sum = 0;
			System.out.println("The maximum sum is " + maximum);
			System.out.println("The minimum sum is " + minimum);
			System.out.println("Total arrays " + ts);
		}
		
	}


