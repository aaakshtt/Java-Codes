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
	public static int first = -1;
	public static int last =-1;
	
	static void printoccu(String str,int index, char element) {
		if(index == str.length()){
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char cha = str.charAt(index);
			if(cha ==element) {
				if(first == -1) {
					first = index;
				}else {
					last = index;
				}
			}
			printoccu(str,index+1,element);
			
		}
    public static void main(String[] args) {
    	String str= "asvdwkjhfvbwsas";
    	System.out.println(str.length());
    	printoccu(str,0, 'a');

    	
    }
}
    
    	
    

    
    

