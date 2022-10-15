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
    public static void main(String[] args) {
    	int n=3;
    	toh(n,"S" , "H " , "D");

    	
}
    static void toh(int n , String src , String help , String dest) {
    	if(n==1) {
    		System.out.println("Move disc"+n +" from " + src + " to "+dest);
    		return;
    	}
    	toh(n-1,src,dest,help);
    	System.out.println("Move disc"+n +" from " + src + " to "+dest);
    	toh(n-1,help,src,dest);
    }

    
    

}
