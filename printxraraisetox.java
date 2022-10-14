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
            int x = 2,n=5;
            int ans = calcpower(x,n);
        System.out.println(ans);

    }
    static int calcpower(int x , int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int xpowm1 = calcpower(x,n-1);
        int xpowm = x*xpowm1;
        return xpowm;
    }


    }













