package com.company;

public class countingoccureneces {
    public static void main(String[] args) {
        int n = 1984634213;
        System.out.println(n);
//         System.out.println(n%10);
//         System.out.println(n/10);
        while (n>0){
            System.out.print(n%10);
            n = n/10;
        }
    }
}
