package com.akshat;
//Java program to demonstrate
//working of Arrays.toString()

import java.io.*;
import java.util.*;

class helloworld {
	public static void main(String[] args)
	{
		int n=6;
		for(int j=1;j<=n &&j>0;j++) {
			for(int k = 1;k<=j;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

// 1
// 12
// 123
// 1234
// 12345
// 123456
