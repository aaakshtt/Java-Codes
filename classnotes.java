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

class Human{                //We crate a class
    String name;            //An instance variable
    String gender;          //Instance variable
    static long count;     //Class variable (we use static keyword);
    int add(int n1,int n2){       //We create a method
        int sum = n1+n2;          //Declare 2 variable
        return sum;               //Return type should be same as the data types
    }
}

public class Solution {
    public static void main(String[] args) {
        //Create an instance of Human class
        Human jack  = new Human();

        //Increase count by one
        Human.count++;
        //Read and print the values of the name , gender , count
        jack.name = "Jack Parker";
        jack.gender = "Male";
        int jackresult = jack.add(34,56);                //Calling the method via the reference/Instance created jack
        String jackname = jack.name;
        String jackgender = jack.gender;
        long population  = Human.count;

        System.out.println("Name is  " + jackname);
        System.out.println("Gendeer is " + jackgender);
        System.out.println("Population is " + population);

        jack.name  = "Jackie Parker";

        //Read and print the changed name
        String changedname = jack.name;
        System.out.println("Changed name is   " + changedname);
        System.out.println(jackresult);     //Printing the result from the method

    }
}


/*A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order: 

Modifiers: A class can be public or has default access (Refer this for details).
Class keyword: class keyword is used to create a class.
Class name: The name should begin with an initial letter (capitalized by convention).
Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
Body: The class body is surrounded by braces, { }.
Constructors are used for initializing new objects.
Fields are variables that provide the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.
There are various types of classes that are used in real time applications such as nested classes, anonymous classes, lambda expressions. 
It is a basic unit of Object-Oriented Programming and represents real life entities. A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of : 

State: It is represented by attributes of an object. It also reflects the properties of an object.
Behavior: It is represented by methods of an object. It also reflects the response of an object with other objects.
Identity: It gives a unique name to an object and enables one object to interact with other objects.
When an object of a class is created, the class is said to be instantiated. 
All the instances share the attributes and the behavior of the class. 
But the values of those attributes, i.e. the state are unique for each object. A single class may have any number of instances.

https://www.geeksforgeeks.org/classes-objects-java/
*/







