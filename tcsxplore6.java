/*
create the class Allium with below attributes.
marketId=int
alliumType=String
producingState=String
price=int

the above attributes should be private.write getter
and setter and parameterized constructor.

create class AlliumProgram with main method.
implement two static methods- findTypeByState
and sortByprice in AlliumProgram class.

findTypeByState method:
    This method will take an array of Allium objects.
and a String value as input parameters. The method
will find out type of Allium for given producing state
(String parameter passed).This method will return
AlliumType if found.if there is no Allium that matches
then the method should return null.

sortByPrice method:
This method will take an array of Allium objects and
an int value as input parameters.
This method should return an array of Allium objects
in an ascending order of their price which are less
than the given Allium price(int parameter passed).
if there is no such object found, then the method
should return null.

the above mentioned methods should be called
from   main method.

for findTypeByState method- The main method should
print the AlliumType if the returned value is not null.
if the returned value is null,then it should print
"State not found."

for sortByPrice method-The main method should print
the AlliumType and price from the returned Allium
object array if the returned value is not null.
if the returned value is null then the
main method should print "No Allium found."
*/
package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Allium[] al = new Allium[4];
        for(int i=0;i<4;i++){
            int a =sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d  =sc.nextInt();sc.nextLine();

            al[i] = new Allium(a,b,c,d);
        }
        String state =sc.nextLine();
        int val = sc.nextInt();sc.nextLine();

        Allium ans1 = findTypeByState(al , state) ;
        assert ans1 != null;
        System.out.println(ans1.alliumType);

        Allium[] ans2 =  sortByPrice(al,val);

        for(int i=0;i<ans2.length;i++){
            System.out.println(ans2[i].alliumType);
            System.out.println(ans2[i].price);
        }


    }
    static Allium findTypeByState(Allium[] al , String state){

        for(int i =0;i<al.length;i++){
            if(al[i].producingState.equalsIgnoreCase(state)){
                return al[i];
            }
        }
        return null;
    }
    static Allium[] sortByPrice(Allium[] al , int val){
        Allium[] newarr = new Allium[0];
        for(int i=0;i<al.length;i++){
            if(al[i].price < val){
                newarr = Arrays.copyOf(newarr , newarr.length+1);
                newarr[newarr.length -1] = al[i];
            }
        }
        for(int i = 0;i<newarr.length;i++){
            for(int j=i+1;j<newarr.length-1;j++){
                Allium temp = newarr[i];
                newarr[i] = newarr[j];
                newarr[j] = temp;
            }
        }
        return newarr;
    }

}
class Allium{

    int marketId;
    String alliumType;
    String producingState;
    int price;

    Allium(int marketId , String alliumType , String producingState , int price){
        this.marketId = marketId;
        this.alliumType = alliumType;
        this.producingState = producingState;
        this.price = price;
    }
}

