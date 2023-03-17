package com.company;
    import java.util.Arrays;
    import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        int index =0;
        for(int i=1;i<str.length();i++){
            for(int j=0;j<i;j++){
                if(str.charAt(i) == str.charAt(j)){
                    count=i;
                    break;
                }
            }
        }
        System.out.println(count);
        for(int i=0;i<count;i++){
            System.out.print(str.charAt(i));
        }
    }
}
//Substring with non repeated character from the 1st character
