package com.company;

public class SmarDog {
    private String name;            //declare instance variables
    private double price;           //declare instance variables

    public SmarDog(){               //Declare a constructor
        //Intialize the name and price to unknown and price
        this.name = "Unkown";
        this.price = price;

        System.out.println("Using SMartDOg() COnstructor   ");

    }
    /*The keyword this refers to
the object for which the constructor’s code is executing. The use of the keyword this
is not necessary in the first constructor. However, you must use the keyword this to
refer to instance variables in the second constructor because the names of the formal
parameters hide the names of the instance variables.

     */
    public SmarDog(String name , double price){     //Declare a constructor
        //Intialize the name and instane variables
        // values and names of parameters
        this.name = name;
        this.price = price;

        System.out.println("Using SMartDOg(String , double) COnstructor   ");

    }
    public void bark(){                         //Instance method bark
        System.out.println(name  + " is barking");
    }
    /*The setName() and getName() methods are used to set and get the name of the
smart dog. The setPrice() and getPrice() methods are used to set and get the
price of the smart dog.

     */
    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public void setPrice(double price){
        this.price =price;
    }
    public double getPrice(){
        return this.price;
    }
    public void printDetails(){
        System.out.print("Name " + this.name);
        if (price>0.0){
            System.out.println(" price  " + this.price );

        }
        else {
            System.out.println("Price : Free");
        }
    }

    public static void main(String[] args) {
        //Creating 2 SmartDog objects for 2 different constructors
        SmarDog s1 = new SmarDog();
        SmarDog s2 = new SmarDog("Nova " ,219.2);

        //Print the details about the 2 dogs
        s1.printDetails();
        s2.printDetails();

        //Make them bark
        s1.bark();s2.bark();

        //Change the name and price of the unkown dog
        s1.setName("Tuffy");
        s1.setPrice(100.36);

        //Print the details agian
        s1.printDetails();
        s2.printDetails();

        //Make them bark
        s1.bark();s2.bark();
    }


}
