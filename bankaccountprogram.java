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

class Account{              //Create a class named account
    double balance;         // Instance variables to intialize the balance
    double getBalance(){       // Method to Return the balance of this account
        return this.balance;
    }
    int credit(double amount){      // Make sure credit amount is not negative, NaN or infinity
        if (amount<0.0 || Double.isNaN(amount) || Double.isInfinite(amount)){
            System.out.println("Invalid credit amount :  " + amount);
            return -1;
        }
        //Credit the amount
        System.out.println("Creditng the amount :  " + amount);
        this.balance = this.balance + amount;
        return 1;
    }
    public int debit(double amount){
        //Make sure the debit amount is not negative , Nan or Infinity
        if (amount<0.0 || Double.isNaN(amount) || Double.isInfinite(amount)){
            System.out.println("Invalid debit amount  :" + amount);
            return -1;
        }
        //Make sure the minimum account balance is maintained
        if (this.balance < amount){
            System.out.println("Insufficient funds . Debit attempted " + amount);
            return -1;
        }
        //Debit the amount
        System.out.println("Debiting the amount : " + amount);
        this.balance = this.balance - amount;
        return 1;
    }
}

public class Solution {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.balance = 1000.00;
        ac.credit(100);
        ac.credit(-12);
        ac.debit(-290);
        ac.debit(300);
        ac.debit(10000);
        double latestbalance  = ac.getBalance();
        System.out.println("Latest balance is " + latestbalance);
    }
}
/*The isNaN() method of Java Double class is a built in method in Java
returns true if this Double value or the specified double value is Not-a-Number (NaN),
or false otherwise
Parameters: The function accepts a single parameter val which specifies the value to be checked 
when called directly with the Double class as static method. The parameter is not required when the method is used as instance method.

Return Value: It returns true if the val is NaN else it return false.
 */







