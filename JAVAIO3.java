package com.company;
import java.io.*;
import java.util.Scanner;
public class JAVAIO3 {
    public static void main(String[] args) {
        File newfile1 = new File("JAVAIO3.txt");
            {
                try {
                    if (newfile1.createNewFile()) {
                        System.out.println("New file is created");
                    } else {
                        System.out.println("No new file is created or file already exists");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                FileWriter fw = null;
                try {
                    fw = new FileWriter("JAVAIO3.txt");             //Create object of FileWriter
                    fw.write("Hi \n THis is the first line \n Okay Bye");//Write in the file
                    fw.close();                                             //Close the object
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    Scanner sc = new Scanner(newfile1);         //Create object of Scanner CLass
                    while (sc.hasNextLine()){                   //Boolean condition to check line
                        String line  = sc.nextLine();           //Create object line of Scanner to check line
                        System.out.println(line);               //Print the lines that it has
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
    }

}
