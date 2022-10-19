package akshat2;
import java.util.*;

public class GFG {
	public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements you want in array");
	n = sc.nextInt();
	int[] array = new int[n];		//Creates an array of memory 10
	System.out.println("Enter the elemnts of the array");
	for(int i=0;i<n;i++) {
		array[i] = sc.nextInt();
		
	}
	System.out.println("Array elements are: ");  
	// accessing array elements using the for loop  
	for (int i=0; i<n; i++)   
	{  
	System.out.println(array[i]);  
	} 
	}
}
