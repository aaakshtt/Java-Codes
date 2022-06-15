package akshat2;

public class ceiling_and_floor {
	public static void main(String args[]) {
		
	int[] arr = {2,3,5,6,9,14,16,18};
	int ans =ceiling_in_array(arr,15);
	int ans2 = floor(arr,15);
	System.out.println(ans);			//Shows the index number
	System.out.println(ans2);
	
}
	//return the index of smallest number >= target
	static int ceiling_in_array(int[] array , int target) {
		int start= 0;
		int end= array.length-1;
	//int[] arr = {2,3,5,6,9,14,16,18};
		while(start<=end) {
			//find the middle element
			int mid = (start)+(end-start)/2;
			if(target < array[mid]) {
				end  = mid-1;
			}
			else if(target >array[mid]) {
				start  =mid+1;
			}
			else{
				return mid;
			}
			
		}
		return start;
}		
	//return the index of  greatest number <= target
	static int floor(int[] array , int target) {
		int start= 0;
		int end= array.length-1;
		//int[] arr = {2,3,5,6,9,14,16,18};
		while(start<=end) {
			//find the middle element
			int mid = (start)+(end-start)/2;
			if(target<array[mid]) {
				end  = mid-1;
			}
			else if(target >array[mid]) {
				start  =mid+1;
			}
			else{
				return mid;
			}
			
		}
		return end;
}
}
