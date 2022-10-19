package akshat2;
import java.util.*;

public class GFG {
	public static void main(String[] args) {
	int arr[] = {12,13,14,5,0,56,6,23,52,423,4523,5};
	System.out.println(arr.length);				//prints the length of the array
	int newarr[] = new int[2];					// 5 is the size
	newarr[0] = 10;
	newarr[1] = 20;
	for(int i=0;i<newarr.length;i++)			//length is the property of array  
		System.out.println(newarr[i]);  
	
	
	minarr(arr);								//calling the method
	
	int[] clarr = arr.clone();					// This will clone the array
	System.out.println(clarr[0]);
	
	arr.equals(clarr);
	System.out.println(arr.equals(clarr));		// Will return true or false
	
	arr.getClass();								//Gets the class
	String str = Arrays.toString(arr);
	System.out.println(str);					// Convert the arrays into string
	System.out.println(str.charAt(0 ));			// Return the character at index 0	
	
	Arrays.binarySearch(arr, 56);
	System.out.println(Arrays.binarySearch(arr, 56)); 		//Binary search the element
	System.out.println(Arrays.copyOf(arr, 3));
	int[] newarr =Arrays.copyOf(arr, 3);
	String str = newarr.toString();
	System.out.println(str);
	
	Arrays.sort(arr);
	
	}
	static void minarr(int arr[]) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("The minuimum value of an array is "+min);  
	}
	
	
}
