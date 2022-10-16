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
	
	static void movex(String str ,int index ,int count , String newstring) {
		if(index ==str.length()) {
			for(int i=0;i<count;i++) {
				newstring  = newstring +'x';
			}
			System.out.println(newstring);
			return;
		}
		char currchar = str.charAt(index);
		if(currchar =='x') {
			count++;
			movex(str , index+1, count, newstring);		//Recurrsive fucntion
		}else {
			newstring = newstring + currchar;
			movex(str,index+1,count,newstring);
		}
	}
    public static void main(String[] args) {
    	movex("axbcxxd",0,0,"");
    }
}
    
    	
    

    
    

