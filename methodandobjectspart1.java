package com.company;

public class NameHidingTest3 {
    static int m=20;            //Static variable
    int n =200;                 //Instance variable
    static void printM(){
        /*You can refer only to a static varialbe in this method because you are inside
        a static method
         */
        System.out.println("printM  - m = "  + m );
    }
    //Declare an instance method
    void printN(){
        //You can refer to both static and instance variables in this method because
        // you are inside an instance method
        System.out.println("printMN() - m = " + m);
        System.out.println("printMN() - n = " + n);
    }

            public static void main(String[] args) {
        NameHidingTest3 hd = new NameHidingTest3();
        hd.printM();
        hd.printN();

    }
}

/*The MethodType class declares m as a static variable and n as a non-static variable. It declares printM()
as a static method and printMN() as an instance method. Inside the printM() method, you can refer to only
static variable m because a static method can refer to only static variables. If you uncomment the commented
statement inside the printM() method, the code will not compile because a static method will attempt to
access a non-static variable n. The printMN() method is a non-static method and it can access both static
variable m and non-static variable n. Now you would like to invoke the printM() and printMN() methods of
the MethodType class. The next section explains how to invoke a method.
*/
