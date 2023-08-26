/*
100
Sketchers
sneekers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok
  */

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear[] ft = new Footwear[5];
        for(int i = 0;i<5;i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            ft[i] = new Footwear(a,b,c,d);
        }
        String para1 = sc.nextLine();
        String para2 = sc.nextLine();

        getCount(ft , para1);
        getsecondhighest(ft , para2);


    }
    static void getCount(Footwear[] ft , String para1){
        int count = 0;
        for(int i=0;i<ft.length;i++){
            if(ft[i].footwearType.equalsIgnoreCase(para1)){
                count++;
            }
        }
        if(count >0){
            System.out.println(count);
        }
        else{
            System.out.println("Footwear Not available");
        }
    }

    static void getsecondhighest(Footwear[] ft , String para2){
        Footwear[] help = new Footwear[0];                          //Create an array with 0 value
        for(int i =0;i<ft.length;i++){                              //loop for finding the array with same name
            if(ft[i].footwearName.equalsIgnoreCase(para2)){
                help  = Arrays.copyOf(help , help.length+1);    //creating the new array with the same brand name
                help[help.length-1] = ft[i];                                //Adding the brand name

            }
        }

        //bubble sort
        Footwear temp;
        for(int i=0;i<help.length;i++){                     //first loop
            for(int j=i+1;j<help.length-1;j++){             //second loop
                if(help[i].price >help[j].price){           // if price of first item is greater than second than sort
                    temp = help[j];
                    help[j] = help[i];
                    help[i] = temp;

                }
            }
        }
        System.out.println(help[help.length-1].footwearId);
        System.out.println(help[help.length-1].footwearName);
        System.out.println(help[help.length-1].price);


/*        if(help.length>0){
            for(int i=0;i<help.length;i++){
                System.out.println(help[i].footwearId);
                System.out.println(help[i].footwearName);
                System.out.println(help[i].footwearType);
                System.out.println("              ");
            }
        }

 */
    }


}
class Footwear{
    int footwearId;
    String footwearName;
    String footwearType;
    int price;
    Footwear(int footwearId , String footwearName , String footwearType , int price){
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;

    }

}
