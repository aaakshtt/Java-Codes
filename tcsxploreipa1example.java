/*
Question:

Create the class Student with below attributes.

id-int

name-String

marks-int

age-int



write getters and setters and parametrized constructor in Student class.



Create class Solution with main method.



implement 2 static methods-findStudentWithMaximumAge and searchStudentById

in Solution class.



findStudentWithMaximumAge method:

    This method will take the Array of the Students objects as input and 

returns the Student object having maximum Age.

  For this method,the main method should print the student object details

with maximum age as it is.   





searchStudentById method:

    This method will take 2 input parameters.Array of the Students objects

and an int value  id.and returns the Student object having the mentioned id 

if found, else return null if not found.

  For this method ,main method should print the details of Student objects 

as it is,if the returned value is not null. or it should print 

"No Student found with mentioned attribute." if the returned value is null.



These 2 methods should be called from main method.

*************************************************************************************************

sample input1:

4

100

jisha

35

23

104

Uma

30

45

105

Eva 

36

21

102

Cissy

24

51

100





Sample output1:

id-102

name-Cissy

marks-24

age-51

id-100

name-jisha

marks-35

age-23
*/

package com.company;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Student[] students = new Student[4];
        Scanner sc =new Scanner(System.in);
        int in = sc.nextInt();sc.nextLine();
        for (int i =0;i<in;i++){
            int a=sc.nextInt(); sc.nextLine();

            String b=sc.nextLine();

            int c=sc.nextInt();sc.nextLine();

            int d=sc.nextInt();sc.nextLine();
              students[i] =  new Student(a,b,c,d);
        }
        int input1 = sc.nextInt();sc.nextLine();
        Student ans1 = findStudentwithMaximumAge(students);

        System.out.println(" id = " + ans1.id);
        System.out.println(" Name = " + ans1.name);
        System.out.println(" Marks = " + ans1.getMarks());
        System.out.println(" Age = " + ans1.getAge());


        Student ans2 =searchStudentbyId(students,input1);
        if (ans2 ==null){
            System.out.println("No Student found with mentioned attribute");
        }
        System.out.println(" id = " + ans2.id);
        System.out.println(" Name = " + ans2.name);
        System.out.println(" Marks = " + ans2.getMarks());
        System.out.println(" Age = " + ans2.getAge());
    }
    public static Student findStudentwithMaximumAge(Student[] students){
        int max = students[0].age;

        for(int i = 0;i<4;i++){
            if(students[i].age>max){
                max = students[i].age;
            }
        }
        for (Student student : students) {
            if (student.age == max) {
                return student;
            }
        }

        return null;
    }



    public static Student searchStudentbyId(Student[] students , int input1){

        for (Student student : students) {
            if (student.id == input1) {
                return student;

            }
        }
            return null;
    }

}
class Student{
    int id;
    String name;
    int marks;
    int age;

    //paramterized construcot
    public Student(int id, String name , int marks , int age){
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;

    }

    //getters and setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.marks  = marks;
    }

        }


