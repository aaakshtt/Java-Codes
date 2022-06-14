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
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enetr the number");
    	int number = sc.nextInt();
       
       int ans = palindrome(number);
       if(ans ==number) {
    	   System.out.println("It is a palindrome");
       }
       else {
    	   System.out.println("Not a panildrome");
       }
    
       
        }
    static int palindrome(int number) {
    	int temp =number;
    	int rev = 0,rem = 0;
    	while(temp!= 0) {
    		rem = temp%10;
    		rev = rev*10 + rem;
    		temp = temp/10;
    		
    	}
    	System.out.println(rev);
    	return rev;
    }
    }

