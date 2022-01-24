package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {


            try {
                FileInputStream fst = new FileInputStream("gfg.txt");
                int i = 0;
                while ((i = fst.read()) != -1) {          //Read next byte of data from the input stream and return -1 at the end of the file
                    System.out.print((char)i);         //Print characters of i method
                }
                fst.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}



