package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStream {
    public static void main(String[] args) {
        try {               // Writing in file gfg.txt
            FileOutputStream fs = new FileOutputStream("gfg.txt");
            String s = "GeeksforGeeks";
            // converting string into byte array
            byte b[] = s.getBytes();        //The Java String class getBytes() method does the encoding of string into the sequence of bytes and keeps it in an array of byte
            try {
                fs.write(b);                //Will write whatever is given in the brackets as arguments
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fs.close();                 //Close the FileOutputStrean
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(
                    "file is successfully updated!!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
