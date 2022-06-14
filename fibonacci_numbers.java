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


//1. Take intial number 0
2.Take second number 1
  3/Start the number from 2
  4.Formula is i =i-1 + i-2

public class Solution {
    public static void main(String[] args) throws IOException {

        int n = 9;
        System.out.println(fib(n));
    }
    static int fib(int n) {
    	int f[] = new int[n+2];		//1 extra to handle case , n=0
    	f[0] =0;
    	f[1] = 1;
    	int i;
    	for(i=2;i <=n;i++) {
    		//Add the previous 2 numbers and store it
    		f[i] = f[i-1]+f[i-2];
    		System.out.println(f[i]);
    	}
    	return f[n];
    	
    }
   
    	
    
}
