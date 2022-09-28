package com.company;

public class NameHidingTest3 {
    static int m = 20;            //Static variable
    int n = 200;                 //Instance variable

    static void printM() {
        /*You can refer only to a static varialbe in this method because you are inside
        a static method
         */
        System.out.println("printM  - m = " + m);
    }

    //Declare an instance method
    void printMN() {
        //You can refer to both static and instance variables in this method because
        // you are inside an instance method
        System.out.println("printMN() - m = " + m);
        System.out.println("printMN() - n = " + n);
    }

    public static void main(String[] args) {
        NameHidingTest3 hd = new NameHidingTest3();
        // Create an instance of NameHidingTest class and store its reference in mt reference variable

        /// Invoke the printMN() instance method using the mt reference variable
         //Invoke the class method using the instance reference
        System.out.println("Invoking class method using an instance...");
        hd.printMN();       //You can invoke the class method by calling out the reference varible


        //To invoke a class method, you use the dot notation with the class name.
        // The following snippet of code invokes the printM() class method of the MethodType class:
        // Invoke the printM() class method

        System.out.println("Invoking class method using class name...");
        NameHidingTest3.printM();           //You can also invoke the method by calling out the class name

    }
}

/*The MethodType class declares m as a static variable and n as a non-static variable. It declares printM()
as a static method and printMN() as an instance method. Inside the printM() method, you can refer to only
static variable m because a static method can refer to only static variables. If you uncomment the commented
statement inside the printM() method, the code will not compile because a static method will attempt to
access a non-static variable n. The printMN() method is a non-static method and it can access both static
variable m and non-static variable n. Now you would like to invoke the printM() and printMN() methods of
the MethodType class. The next section explains how to invoke a method.

Notes on Main Method

Why do you need to declare the main() method as static? The main() method serves as the entry point
for a Java application. It is invoked by the JVM when you run a class. The JVM does not know how to create
an instance of a class. It needs a standard way to start Java applications. Specifying all details about the
main() method and making it static provides the JVM a standard way to start a Java application. By making
the main() method static, the JVM can invoke it using the class name, which is passed on the command line.
What will happen if you do not declare the main() method as static? If you do not declare the main()
method as static, it will be treated as an instance method. The code will compile fine. However, you will not
be able to run the class, which has its main() method declared as an instance method.
Can you have more than one main() method in a class? The answer is yes. You can have multiple methods
in a class, which can be named main as long as they do not have the same signature. The following declaration
for the MultipleMainMethod class, which declares three main() methods, is valid. The first main() method,
which is declared as public static void main(String[] args), may be used as the entry point to run an
application. The other two main() methods have no special significance as far as the JVM is concerned.


*/
