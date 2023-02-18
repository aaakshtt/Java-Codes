package com.company;

import java.io.IOException;
import java.lang.*;
import java.util.*;


class Solution {

    public static void main(String[] args) {
    Horse h = new Horse();
    h.walk();
    h.eat();
    Chicken ch = new Chicken();
    ch.walk();
    ch.eat();
   System.out.println(ch.color);

   Mustang ms = new Mustang();
        System.out.println("color of mustang horse is " +ms.color);

    }

}
abstract class Animal{
    String color;
    void eat(){
        System.out.println("ANimal Eats");
    }
    abstract void walk();           //Abstract method and no implmentation

    Animal(){
        color = "Peach";            //Default value for every derived class

    }
}
class Horse extends Animal{         //Walk method will be compulsory for horse
    Horse(){
        System.out.println("Horse constrcutor is called");
    }
    void changecolor(){
        color = "Dark Brownm";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changecolor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang horse is here");
    }
}






