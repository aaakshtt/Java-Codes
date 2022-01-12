
class Base{
  Base(){             //First constructor
    System.out.println("I am a constructor");
  }
  Base(int x){           //Second construcotr
    System.out.println("Constructor with argument a as    " + x);
    
  }
 
}
class Derived extends Base{
  Derived(){ 
    //super(33);  //If we want to run constructor of Base Class with argument we need to use super keyword
    				//Take 33 and go to super class
    System.out.println("Constructor of derived class");
  }
  Derived(int x , int y){
    super(x); 																	//This will take x value and execute in super class ie Base
    System.out.println("Construcotr o f derived clas with argument of x and y as  " + x +  " &  "+ y);
  }
  
 
}

class ChildDerived extends Derived{
  ChildDerived(){
    System.out.println("I am a child of Derived Class");
  }
  ChildDerived(int x , int y , int z){   										//Overloading the constructor
    super(x,y);                 								//This will take x and y values and execute in super class ie Derived
    System.out.println("I am a child of Derived Class and my arguments are   " + x+"  " + "   "+ y + "   " + z);
  }
}

public class ConstructorinInheritance {
  public static void main(String[] args) {
    //Base b = new Base();
    //Derived d = new Derived(5,33);      //We can give arguments over here as well
    //ChildDerived chd = new ChildDerived();
     ChildDerived chd = new ChildDerived(10,20,30);
   
    }
}
