/*


tcsjavaquestions
TCS IRA 13 DECEMBER JAVA CODING QUESTION SOLUTION.
- January 03, 2022
Create a class newspaper with below attributes.



regNo-int

name-String

publicationYear-int

price-int



Write parametrised constructor as required.



Create class Solution with main method.

Implement 2 static methods findTotalPriceByPublicationYear and 

searchNewspaperByName in solution class.



findTotalPriceByPublicationYear method:

   This method will take array of the Newspaper objects and int parameter

type.This method will return the total price of newspapers from array of 

Newspaper objects,If the publication year attribute matches with the int 

parameter passed .If no Newspaper with the given publication year is present 

in the array ,then the method should return 0.



The main method should print total price if the returned value is greater 

than 0.Else it should print "No Newspaper found with the mentioned attribute".







searchNewspaperByName method :

   This method will take the array of the Newspaper objects and the String 

parameter type.This method will return the Newspaper object from the Array

of Newspaper objects,If the name attribute matches with the string 

parameter passed.

If no Newspaper with the given name is present in the array ,then the 

method should return null.



The main method should print the regNo,name,year of publication,and price 

if the returned Newspaper object is not null.

else it should print "No Newspaper found with the given name."





The above mentioned static methods should be called from main method.



**************************************************************************************************

input1:



134

Evening Mail

2018

79

178

Morning Mail

2017

65

176

Daily News

2017

98

219

Times of India

1988

15

2017

Times of India





output1:

163

regNo-219

name-Times of India

publicationYear-1988

price-15









input2:



201

Afternoon Mail

2019

79

202

Morning Mail

2014

65

156

Daily News

2004

98

278

Times of India

1967

15

2017

Times of America





output2:

No Newspaper found with the mentioned attribute

No Newspaper found with the given name





Didn't understand the solution given above ?

Watch the video given below:


Comments

Popular posts from this blog
how to solve a java question that is usually asked in TCS IRA/PRA/CPA Exam?
- January 16, 2022
Image
 Create a class called Student with the below attributes: rollNo - int name - String branch - String score – double dayScholar - boolean The above attributes should be private, write getters, setters  and parameterized constructor as required. Create class Solution with main method. Implement two static methods -findCountOfDayscholarStudents   and findStudentwithSecondHighestScore in Solution class. findCountOfDayscholarStudents: This method will take an array of Student objects as an input parameter.  This method will calculate and return the count of Students whose score  is greater than 80 and who are all from dayScholar. If no Student scored greater than 80 and from dayScholar are present  in the array of Student objects, then the method should return 0. For findCountOfDayscholarStudents method -  The main method should print the returned count as it is if  the returned value is greater than 0, else it should print  "There are no such dayscholar students". findStudentwith
READ MORE
28 february IRA JAVA solution.
- March 08, 2022
Question:  Create a class Music with below attributes: playListNo - int type -String count - int duration(minutes) -double. The above attributes should be private.Write Getter and Setter and  parametrized constructor as required. Create class Solution with main method. **************************************************************************** Implement two static methods: findAvgOfCount and sortTypeByDuration in  Solution Class. findAvgOfCount Method:    This method will take an array of Music objects and an int value as input parameters.The method will find out Average (as int) of count for those  objects whose count is more than the given Count(int parameter passed).This  method will return average if found.If there is no Type that matches then  the method should return 0. for this method- main method should print average ,if the returned value is not 0.If the returned value is 0 then main method should print  "No playlist found". sortTypeByDuration method:    This method
READ MORE
 Powered by Blogger
Theme images by 5ugarless
My photo
SADIK PATHAN
I am currently working as Assistant System Engineer in TCS.I know basics of Linux,windows,windows server, Networking,Virtualization,Microsoft Sql Server. I have Interest in Machine Learning,Web Development technologies like Html,Css,JavaScript and programming languages like Java,Python,Cpp.I have also Explored Android Development and Python Game Development. I Started learning to code when I was in Second year of Engineering.Because I wanted to make my own website and game Application.I have gained a little experience in designing websites and designing Android Applications.
VISIT PROFILE
Archive
Report Abuse*/


package com.company;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Newspaper[] ns = new Newspaper[4];
        for(int i = 0;i<4;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            ns[i] = new Newspaper(a,b,c,d);
        }


        int para = sc.nextInt();sc.nextLine();
        String paras = sc.nextLine();

        int ans1 = findTotalPriceByPublicationYear(ns,para);
        System.out.println(ans1);



        Newspaper ans2 = searchNewspaperByName(ns,paras);
        System.out.println("Reg No  " + ans2.regNo);
        System.out.println(" Name  = " + ans2.getName());


    }

    public static int  findTotalPriceByPublicationYear(Newspaper[] ns, int para){
        int sum = 0;
        for(int i=0;i<ns.length;i++){
            if(ns[i].publicationYear == para){
                sum = sum + ns[i].price;

            }

        }
        return sum;
    }
    public static Newspaper searchNewspaperByName(Newspaper[] ns, String paras){
        for(int i = 0;i<ns.length;i++){
            if(ns[i].name.equalsIgnoreCase(paras)){
                return ns[i];
            }
        }
        return null;
    }

}
class Newspaper{
    int regNo;
    String name;
    int publicationYear;
    int price;

    Newspaper(int regNo , String name , int publicationYear , int price){
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price  = price;
    }

    public void setRegNo(int regNo){
        this.regNo = regNo;
    }
    public int getRegNo(){
        return regNo;
    }

    //2
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //3
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public int getPublicationYear(){
        return publicationYear;
    }

    //4
    public void setprice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

}

