/*
 may 30 tcs cpa java coding question.


 

create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.

create class courseProgram with main method.

implement two static methods-
   findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."
*/






package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] cs = new Course[4];
        for (int i = 0; i < cs.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            int e = sc.nextInt();
            sc.nextLine();

            cs[i] = new Course(a, b, c, d, e);
        }
        String vl = sc.nextLine();
        int value = sc.nextInt();sc.nextLine();
        int ans1 = findAvgOfQuizByAdmin(cs, vl);
        System.out.println("Sum no  = " + ans1);


        Course[] ans2 = sortCourseByHandsOn(cs,value);
        for(int i = 0;i<ans2.length;i++){
            System.out.println(ans2[i].getCourseName());
        }
    }
        public static int findAvgOfQuizByAdmin(Course[] cs, String vl){
        int sum = 0;
        int count= 0;
        for(int i = 0;i<cs.length;i++){
            if(cs[i].getCourseAdmin().equalsIgnoreCase(vl)){
                sum  =sum + cs[i].getQuiz();
                count++;
            }
        }
        return sum/count;

        }
        public static Course[] sortCourseByHandsOn(Course[] cs , int value){
                Course[] arr  = new Course[0];
                for(int i = 0;i<cs.length;i++){
                    if(cs[i].getHandsOn()< value){
                        arr =Arrays.copyOf(arr , arr.length+1);
                        arr[arr.length-1] = cs[i];
                    }
                }



                //bubble sort
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length - 1; j++) {
                        if (arr[i].getHandsOn() > arr[j + 1].getHandsOn()) {
                            Course temp  =arr[j];       //Course is the type of variable
                            arr[j] = arr[j+1];
                            arr[j+1] =temp;
                        }
                    }
                }
                return arr;

        }
    }



class Course{
    private int courseId;
   private  String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    Course(int courseId , String courseName , String courseAdmin, int quiz , int handson){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;

    }
    //1
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public int getCourseId(){
        return courseId;
    }

    //2
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }

    //3
    public void setCourseAdmin(String courseAdmin){
        this.courseAdmin = courseAdmin;
    }
    public String getCourseAdmin(){
        return courseAdmin;
    }

    //4
    public void setQuiz(int quiz){
        this.quiz = quiz;
    }
    public int getQuiz(){
        return quiz;
    }

    //5
    public void setHandsOn(int handson){
        this.handson = handson;
    }
    public int getHandsOn(){
        return handson;
    }

}

