package com.company;
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import java.util.Scanner;

import static java.util.stream.Collectors.*;

class Maths{
    int max(int ... num){               //Var Args or variable arguments method
        int max = Integer.MIN_VALUE;  //Integer.MAX_VALUE is a constant in the Integer class of java.lang package that specifies that stores the maximum possible value for any integer variable in Java. 
                                        // The actual value of this is
        for (int i =0; i< num.length;i++){  //Run a for loop
            if (num[i] > max){              //if num at index i is greater than max
                max = num[i];               //Updare max to the largets number
            }
        }
        return max;
    }
}
public class Solution {
    public static void main(String[] args) {
        Maths m1 = new Maths();             //Creating a reference / handle
        int max = m1.max(12,344,5,7,8,855,5);       //Passing the parameters
        System.out.println("The maximum number is   " + max );

    }
}








