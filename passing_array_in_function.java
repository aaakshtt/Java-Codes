/**
 * 
 */
package com.akshat;
import java.util.Arrays;
/**
 * @author Akshat
 *
 */
public class Passing_in_functions {

	public static void main(String[] args) {
	 int nums[] = {1,2,3,4};
	 System.out.println(Arrays.toString(nums));
	 change(nums);
	 System.out.println(Arrays.toString(nums));
	}
	static void change(int arr[]) {
		arr[0] =  99; 
	}

}


OUTPUT->  [1, 2, 3, 4]
          [99, 2, 3, 4]
