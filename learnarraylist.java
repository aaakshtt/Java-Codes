package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentsname = new ArrayList<>();
        studentsname.add("Rakesh");
        studentsname.add("Akshat");
        studentsname.add("Prites");
        studentsname.add("Karan");
        studentsname.add(0,"First");
        System.out.println(studentsname.size());
        System.out.println(studentsname.get(1));
        System.out.println("Print the old list" +studentsname);


        ArrayList<String> newlist = new ArrayList<>();
        newlist.add("Atharva");
        newlist.add("Hitesh");
        newlist.add("harshit");
        studentsname.addAll(newlist);           //Adds the new list to the old list mentioned
        
        String std = studentsname.toString();
        System.out.println(std);
        studentsname.remove(4);           //Remove element at index 4
        int size = studentsname.size();
        System.out.println(size);
        System.out.println("Prints the new list " +studentsname);
        studentsname.remove(String.valueOf("Hitesh"));         //Removes the string
        System.out.println(studentsname);
        studentsname.set(2,"CHanged position");   //To update the position and change data

        /*
        for (int i=0;i< studentsname.size();i++){           //Code for transverisng througth the arraylist
            System.out.println("The string is " + studentsname.get(i));
        }
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(10);
        for (Integer element : list){                   //For every integer element in the list keep exectuong the loop
            System.out.println("The element is " + element);
        }

        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("itertator " + it.next());
        }
    }

}
