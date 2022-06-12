package akshat2;

public class Searchin2Darray {

	public static void main(String args[]) {
		int[][] arr = {
				{12,131,14},
				{15,17,98},
				{95,45},
		};
		int target =98;
		find(arr,target);
		max(arr);
		
	}
	static void find(int[][] arrays,int target){
		if(arrays.length ==0) {
			System.out.println("no array");
		}
		for(int row =0;row<arrays.length;row++) {
			for(int col = 0;col<arrays[row].length;col++) {
				if(arrays[row][col] == target) {
					System.out.println("The location is at  " +row +"  and the column is  " + col);
				}
			}
		}
	}
	static void max(int[][] arrays) {
		int max = Integer.MIN_VALUE;
		for(int[] ints : arrays) {
			for(int element : ints) {
				if(element>max) {
					max = element;
				}
			}
		}
		System.out.println(max);
		
	}
}

		

