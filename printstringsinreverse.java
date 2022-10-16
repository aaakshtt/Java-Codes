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
	
	
	static void printrev(String str, int index) {
		if(index ==0) {
			System.out.println(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		printrev(str,index-1);
	
	
    }
    public static void main(String[] args) {
    	String str = "abcd";
    		printrev(str, str.length()-1);

    	
    }
}
    
    	
    

    
    

