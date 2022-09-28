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

class Student{              //Creating a class
    int rollno;             //Instance variables
    String name;
    float fee;
    Student(int rollno,String name,float fee){   //Constructor
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;

    }
    void display(){
        System.out.println((rollno +  "  " + name  + fee));
    }
}

public class Solution {
    public static void main(String[] args) {
        Student s1 = new Student(111,"ankit" ,500f);
        Student s2 = new Student(112,"KAja" , 3000f);
        s1.display();
        s2.display();

    }
}








