package com.company;
//Methods in interface should always be public
//We can implement more than one interface
//But in class only once class can be called
//As shown in the figure given below, a class extends another class, an interface extends another interface, but a class implements an interface
interface Bicycle{                                      //Interface is a group of methods
    int a =45;
    public void applyBrake(int decrement);             //Creating method
    public void sppedup(int increment);                //Creating method

}
interface HornBicyle{
    void blowhornhb();

}
class AvonCycle implements Bicycle,HornBicyle{
    void blowhorn(){                                    //Creating method
        System.out.println("PO PO PO");
    }
    public void applyBrake(int decrement){              //Always create public method
        System.out.println("Applying Brake in Avon with force of " + decrement);
    }
    public void sppedup(int increment){                 //Always create public method
        System.out.println("Apply gas in Avon with force of "+ increment);
    }
    public void blowhornhb(){                           //Always create a public method in interface
        System.out.println("Kabhi Khushi Kabhi Gam");
    }

}
class PhantomCycle implements Bicycle,HornBicyle{
    void blowhorn(){
        System.out.println("PO PO PO");
    }
    public void applyBrake(int decrement){              //Always create public method
        System.out.println("Applying Brake in Phantom with force of" + decrement);
    }
    public void sppedup(int increment){                 //Always create public method
        System.out.println("Apply gas in Phantom with force of "+ increment);
    }
    public void blowhornhb(){                           //Always create a public method in interface
        System.out.println("Main Hoo na in Phantom");
    }
}

public class AbstractVsInterface {
    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.applyBrake(200);
        av.sppedup(55);
                                                //Calling the object 2 time
        av.applyBrake(100);
        av.sppedup(25);
                                                //Calling the variable in Interface
        System.out.println(av.a);               //You can create properties in interface
        //You cannot modify properties in interface as they are permanent
        //av.a = 96;                      //cannot assign a value to final variable a
        av.blowhornhb();

        PhantomCycle ph  =new PhantomCycle();
        ph.applyBrake(-23);
        ph.sppedup(+100);
        ph.blowhornhb();


    }
}
