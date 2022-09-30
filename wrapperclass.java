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


public class Solution {
    public static void main(String[] args)  throws Exception {
        // Creates an Integer object
        Integer intObj = Integer.valueOf(100);
        // Gets byte from Integer
        byte b = intObj.byteValue();

        // Gets double from Integer
        double dd = intObj.doubleValue();
        System.out.println("intObj = " + intObj);
        System.out.println("byte from intObj = " + b);
        System.out.println("double from intObj = " + dd);
// Creates a Double object
        Double doubleObj = Double.valueOf("329.78");
// Gets different types of primitive values from Double
        double d = doubleObj.doubleValue();
        float f = doubleObj.floatValue();
        int i = doubleObj.intValue();
        long l = doubleObj.longValue();
        System.out.println("doubleObj = " + doubleObj);
        System.out.println("double from doubleObj = " + d);
        System.out.println("float from doubleObj = " + f);
        System.out.println("int from doubleObj = " + i);
        System.out.println("long from doubleObj = " + l);

        String str = "01111111";
        int radix = 2;
        // Creates an Integer object from the string
        Integer intObject = Integer.valueOf(str, radix);
        // Extracts the int value from the string
        int intValue = Integer.parseInt(str, 2);
        System.out.println("str = " + str);
        System.out.println("intObject = " + intObject);
        System.out.println("intValue = " + intValue);

        String dateStr = "2017-07-29";
        int year = Integer.parseInt(dateStr, 0, 4, 10);
        int month = Integer.parseInt(dateStr, 5, 7, 10);
        int day = Integer.parseInt(dateStr, 8, 10, 10);

        System.out.println("Year = " + year);
        System.out.println("Month = " + month);
        System.out.println("Day = " + day);


        String str1 = "123.89";
        try {
            double value1 = Double.parseDouble(str1);
            System.out.println("value1 = " + value1);
        } catch (NumberFormatException e) {
            System.out.println("Error in parsing " + str1);
        }
        String str2 = "78H.90"; // An invalid double
        try {
            double value2 = Double.parseDouble(str2);
            System.out.println("value2 = " + value2);
        } catch (NumberFormatException e) {
            System.out.println("Error in parsing " + str2);
        }


    }

}


/*
Your program may receive numbers as strings. You may want to obtain primitive values or wrapper
objects from those strings. Sometimes the integer values in a string may be encoded in different bases
(also called radix), for example, decimal, binary, hexadecimal, etc. Wrapper classes help in working with
strings containing primitive values.
•	 Use the valueOf() methods to convert strings into wrapper objects.
•	 Use the parseXxx() methods to convert strings into primitive values
The Byte, Short, Integer, Long, Float, and Double classes contain parseByte(), parseShort(),
parseInt(), parseLong(), parseFloat() and parseDouble() methods to parse strings into primitive values,
respectively.

Java 9 added a few methods in the Integer and Long classes to parse a string whose contents are not all
integers. The following is a list of such methods in the Integer class. Method names in the Long class end
with Long and return long. All these methods throw a NumberFormatException.
•	 int parseInt(CharSequence s, int beginIndex, int endIndex, int radix)
•	 int parseUnsignedInt(CharSequence s, int beginIndex, int endIndex, int
radix)
•	 int parseUnsignedInt(String s)
•	 int parseUnsignedInt(String s, int radix)


The three versions of the parseInt() method parse strings as signed integers, whereas the three
versions of the parseUnsignedInt() method parse digits in a string as an unsigned integer in the specified
radix.
All numeric wrapper classes contain several useful constants. Their MIN_VALUE and MAX_VALUE
constants represent the minimum and maximum values that can be represented by their corresponding
primitive type. For example, the Byte.MIN_VALUE constant is -128 and the Byte.MAX_VALUE constant is 127,
which are the minimum and maximum values that can be stored in a byte. They also have a SIZE constant
that represents the size in bits that a variable of the corresponding primitive type occupies. For example,
Byte.SIZE is 8 and Integer.SIZE is 32.
Typically, you receive strings from external sources, for example, a file. If strings cannot be converted
to numbers, wrapper classes will throw a NumberFormatException. It is common to place the string parsing
logic inside a try-catch block and handle the exceptions.
The following snippet of code attempts to parse two strings into double values. The first string contains
a valid double and the second one contains an invalid double. A NumberFormatException is thrown when
the parseDouble() method is called to parse the second string.

 */





