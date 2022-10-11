package com.company;

public class GFG {
    public static void main(String[] args) {
        int n=23;
        prime(n);
    }
    static void prime(int n) {
        int flag = 0;

        int m = n / 2;
        for (int j = 2; j <= m; j++) {
            if (n % j == 0) {
                System.out.println("Not a prime");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Prime");
        }

    }}
//Check if the number is prime or not method 2
