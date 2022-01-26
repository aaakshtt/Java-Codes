//YOu can use the ByteArrayInputStream class to open an input stream from an array of bytes in memory

package com.company;
import java.io.*;
import java.io.IOException;

public class ByteArrayInputStreamDemo{
        public static void main(String args[])    throws IOException {

            byte[] data;                        //Declare variable name of array with datatype
            data = "DreamTech Press".getBytes();//Instantiating an array by calling the name
            //The Java String class getBytes() method does the encoding of string into the sequence of bytes and keeps it in an array of bytes.

            ByteArrayInputStream in  = new ByteArrayInputStream(data);          //We create a object of
            //We create a object of ByteArrayInputStream for reading and displaying the text byte by byte

            int character;              //Declaring the variables
            while ((character = in.read()) != -1){
                System.out.print((char) character);
            }

        }
}
