package com.company;
import java.io.*;
import java.util.Scanner;

public class JavaIO2 {
    public static void main(String[] args) {
        File newfile = new File("JAVAIO2.txt");     //Create a new object if class  File
       try {
            if(newfile.createNewFile()){
               System.out.println("New file is created");
            }
            else {
               System.out.println("No new file is created");
          }
       } catch (IOException e) {
           e.printStackTrace();     }

        Scanner sc = null;
        try {
            sc = new Scanner(newfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        System.out.println(newfile.canRead());          //Print if the file can read
        System.out.println(newfile.isFile());           //Prints if the file is an actual file
        System.out.println(newfile.getParent());        //It returns the pathname string of this abstract pathname's parent,

    }
    }
