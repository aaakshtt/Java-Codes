/*
 Q2.

Create the class RRT(Rapid response team) with the below attributes:



ticketNo-int

raisedBy-String 

assignedTo-String

priority-int

project-String



All attributes should be private,write getters and setters and 

parameterized constructor as required.



Create class MyClass with main method.



Implement a static method-getHighestPriorityTicket in MyClass class.



getHighestPriorityTicket method:

     This method will take an array of RRT objects ,and a String value as 

parameters.This method will return the RRT object with highest priority

ticket from the array of the RRT objects for the given project(String 

parameter passed).Highest priority is the one which has lesser value.

for example:1 is considered as high priority and 5 is considered as 

low priority.

   If no RRT with the above condition is present in the array of the 

RRT objects,then the method should return null.

   The main method should print the ticketNo,raisedBy and assignedTo

from returned object if the returned object is not null.if the returned 

object is null then main method should print "No such Ticket". 

*/
package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RRT[] rapid = new RRT[4];
        for(int i =0;i<4;i++){
            int a =sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            rapid[i] = new RRT(a,b,c,d,e);
        }
        String value = sc.nextLine();

        RRT ans = getHighestPriorityTicket(rapid , value);
        System.out.println("Ticket No  " + ans.ticketNo);
        System.out.println("Priority no "   + ans.priority);


    }
    public static RRT getHighestPriorityTicket(RRT[] rapid , String value){
        RRT x=null;
        int pr =100;
        for(int i =0;i<rapid.length;i++){
            if(rapid[i].project.equalsIgnoreCase(value)){
                    if(rapid[i].priority<pr){
                        x= rapid[i];
                        pr= rapid[i].priority;
                    }
            }
        }
        if(x!=null)
        {
            return x;
        }

        return null;

    }
}
class RRT{
    int ticketNo;
    String raiseBy;
    String assignedTo;
    int priority;
    String project;

    RRT(int ticketNo, String raiseBy, String assignedTo, int priority, String project){
            this.ticketNo = ticketNo;
            this.raiseBy = raiseBy;
            this.assignedTo = assignedTo;
            this.priority = priority;
            this.project = project;
    }
}

