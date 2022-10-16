package akshat2;

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

public class Solution {
	
	static boolean issorted(int arr[] , int index) {
		
		if(index ==  arr.length-1) {			// -1 is very important
			System.out.println("true");
			return true;						// base case 
		}	
		
		if(arr[index] < arr[index+1]) {
			//array is sorted
			return issorted(arr,index+1);
		}else{
			System.out.println("false");
			return false;
		}

	}
    public static void main(String[] args) {
    	int arr[] = {1,2,3,4};
    	issorted(arr,0);
    }
}
    
    	
    

    
    

