/*
 QUESTION:

create a class Antenna with below attributes.
antennaid=int
antennaName=String
projectLead=String
antennaVSWR=double

the above attribute should be private ,write getter and
setter and parametrized constructor as well.

create class MyClass with main method.
implement two static methods searchAntennaByName and sortAntennaByVSWR
in MyClass class.


searchAntennaByName :
  This method will take an array of Antenna objects and the
string value as input parameter.The method will find out Antenna name(String parameter
passed) .it will return Antennaid if found.if there is no Antenna that matches then the
method will return zero.
the main method should print the antennaid,if the returned value is not 0.if the
returned value is 0 then print,"There is no antenna with the given parameter".


sortAntennaByVSWR:
This method will take an array of Antenna Objects and a double value as input.
this method will return an array of Antenna objects sorted in ascending orderof their
antennaVSWR. which is less than VSWR(double value passed)       

  the main method should print name of the project leads from the returned array
if the returned value is not null.if the returned value is null then main method should
print "No Antenna found";


input1:

111
Reconfigurable
Hema
0.4
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.3
444
Dielectric
Sai
0.65
Microstrip
0.5

output:
333
Teju
Hema


input 2:
111
Reconfigurable
Hema
0.3
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.4
444
Dielectric
Sai
0.65
Resonator
0.25

output:
There is no antenna with given parameter
No Antenna found
*/
package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Solution1{
    public static void main(String[] args)throws java.lang.Exception{
        Antenna[] ante = new Antenna[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<ante.length;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();sc.nextLine();
            ante[i]= new Antenna(a,b,c,d);
        }
        String name = sc.nextLine();
        double VSWR = sc.nextDouble();
        sc.nextLine();
        //calling method below
        int ans = searchAntennaByName(ante,name);
        if(ans==0){
            System.out.println("There is no antenna with the given parameter.");
        }
        else{
            System.out.println(ans);
        }
        //calling method below
        Antenna[] ans2 = sortAntennaByVSWR(ante,VSWR);
        if(ans2==null){
            System.out.println("No Antenna found");
        }
        else{
            for (Antenna antenna : ans2) {
                System.out.println(antenna.projectLead);
            }
        }
    }
    //first method
    public static int searchAntennaByName(Antenna[] ante, String name){
        for (Antenna antenna : ante) {
            if ((antenna.antennaName).equalsIgnoreCase(name)) {
                return antenna.antennaid;
            }
        }
        return 0;
    }
    //second method
    public  static Antenna[] sortAntennaByVSWR(Antenna[] antennas,double inputAntennaVSWR)
    {
        Antenna[] help = new Antenna[0];
        for(int i = 0;i<antennas.length;i++){
            if(antennas[i].antennaVSWR <inputAntennaVSWR ){
                help = Arrays.copyOf(help, help.length+1);
                help[help.length-1] = antennas[i];
            }
        }
        //bubble sort
        double temp;
        for(int i = 0;i<help.length;i++){
            for(int j = i+1;j<help.length-1;j++){
                temp = help[i].antennaVSWR;
                help[i].antennaVSWR = help[j].antennaVSWR;
                help[j].antennaVSWR = temp;
            }
        }
        if(help.length>0){
            return help;
        }
        else{
            return null;
        }
    }
}

class Antenna{
    public int antennaid;
    public String antennaName;
    public String projectLead;
    public double antennaVSWR;

    Antenna(int antennaid,String antennaName,String projectLead,double antennaVSWR){
        this.antennaid=antennaid;
        this.antennaName=antennaName;

        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;
    }
}
