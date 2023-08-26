/*
Create a class called Student with the below attributes:

rollNo - int
name - String
branch - String
score - double
dayScholar - boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods -findCountOfDayscholarStudents  and findStudentwithSecondHighestScore in Solution 
class.

findCountOfDayscholarStudents:

This method will take an array of Student objects as an input parameter . This method will calculate and return 
the count of Students whose score is greater than 80 and who are all from dayScholar.

If no Student scored greater than 80 and from dayScholar are present in the array of Student objects, then the
method should return 0.

findStudentwithSecondHighestScore:

This method will take an array of Student objects as an input parameter. This method will return the object 
of the second highest score student from the array of Student objects who are not from the dayScholar.

If no Student is a dayScholar  in the array of Student objects, then the method should return null.

Note : All the searches should be case insensitive.

The combination of dayScholar and score for each student is always unique.

The above mentioned static methods should be called from the main method.

For findCountOfDayscholarStudents method - The main method should print the returned count as it is 
if the returned value is greater than 0, else it should print "There are no such dayscholar students".

For findStudentwithSecondHighestScore method - The main method should print the rollNo, name and score 
in the below format from the returned object if the retuned value is not null.

rollNo#name#score

If the returned value is null, then it should print ”There are no student from non day scholar”

Before calling these static methods in main, use Scanner object to read the values of four Student 
objects referring attributes in the above mentioned attribute sequence. 
Consider below sample input and output:

Input:

1001
Ashwa
IT
85
true
1002
Preeti
IT
70
false
1003
Uma
ECE
85
false
1004
Akash
EEE
90
true


Output:
2
1002#Preeti#70.0
  */

import java.util.Scanner;
import java.util.Arrays;
public class Main2 {
    public static void main(String args[]){
        Student[] st = new Student[4];
        Scanner sc= new Scanner(System.in);
        for(int i = 0;i<4;i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();
            st[i] = new Student(a,b,c,d,e);

        }
        findcount(st);
        secondhighest(st);



    }
    static void findcount(Student[] st  ){
        int count = 0;
        for(int i=0;i<st.length;i++){
            if(st[i].score >80 && st[i].dayscholar==true){
                count++;

            }
        }
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("There are no such dayscholar students");
        }

    }

    static void secondhighest(Student[] st ){
        Student[] help = new Student[0];
        for(int i = 0;i<st.length;i++){
            if(st[i].dayscholar !=true){
                help = Arrays.copyOf(help , help.length+1);
                    help[help.length-1] = st[i];
            }
        }

        //bubble sort
        for(int i=0;i<help.length;i++){
            for(int j =i+1;j<help.length-1;j++){
                Student temp;
                if(st[i].score >st[j].score){
                    temp = help[i];
                    help[i] = help[j];
                    help[j] = temp;

                }
            }
        }

        if(help.length>0){
            System.out.println(help[help.length-2].roll);
            System.out.println(help[help.length-2].name);
            System.out.println(help[help.length-2].score);
        }
        else{
            System.out.println("There are no student from non day scholar");
        }

    }
}
class Student{
    int roll;
    String name;
    String branch;
    double score;
    boolean dayscholar;
    Student(int roll , String name , String branch , double score , boolean dayscholar ){
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayscholar = dayscholar;
    }
}
