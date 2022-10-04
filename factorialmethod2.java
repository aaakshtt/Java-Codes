package com.company;

public class GFG {
    public static void main(String[] args) {
      factorial(5);
    }
    static void factorial(int num){
        int temp=1;
        for (int i = num;i<=num && i>0;i--){
            temp = temp*i;
        }
        System.out.println(temp);
    }
}
/*
Find the factorial of a number by creating a for loop
