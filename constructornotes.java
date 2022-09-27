class Geek{
    int num = 12;
    String name = "My name is AKshat";
    //this would be invoked while an object of the class is created
    Geek(){
        System.out.println("Constructor is called");
    }
    Geek(int age){
        System.out.println("The age of Akshat is  " + age);
    }

}
public class Solution {
    public static void main(String[] args) {

        Geek geek1 = new Geek();//this would invoke default constructor
        Geek geek2 = new Geek(100);
        //Default constructor provides the default values
        System.out.println(geek1.name);
        System.out.println(geek1.num);
    }
}

/*w the most important topic that comes into play is the strong incorporation of OOPS with constructors known as constructor overloading. 
JustLike methods, we can overload constructors for creating objects in different ways.
Compiler differentiates constructors on the basis of numbers of parameters, types of the parameters, and order of the parameters. 
Each time an object is created using a new() keyword, 
at least one constructor (it could be the default constructor) is invoked to assign initial values to the data members of the same class. 
So constructors are used to assign values to the class variables at the time of object creation, 
either explicitly done by the programmer or by Java itself (default constructor).
Java constructors or constructors in Java is a terminology been used to construct something in our programs. 
A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. 
It can be used to set initial values for object attributes. 
In Java, a constructor is a block of codes similar to the method. 
It is called when an instance of the class is created. 
At the time of calling the constructor, memory for the object is allocated in the memory.
It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.
/*
*/

