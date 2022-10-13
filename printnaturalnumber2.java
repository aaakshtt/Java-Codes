package com.company;

import java.awt.*;
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
import java.lang.*;

import java.util.Scanner;

import static java.util.stream.Collectors.*;


class Solution {
    public static void main(String[] args){
        printnum(1,5,0);
    }
    static void printnum(int i,int n , int sum){
        if (i==n){
            sum = sum +i;
            System.out.println(sum);
            return;
        }
       sum  = sum+i;                //Addition function
       printnum(i+1,n,sum);         //recurrsive function
    }
    }












