package akshat2;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = {12,13,14,16,18,909,33};
		tofind(arr,1,33,16);
	}
	static boolean tofind(int[] array,int start , int end,int tofind) {
		if(array.length== 0) {
			return false;
		}
		for(int j = start;j>=start && j<end ; j++) {
			if(tofind ==array[j]) {
				System.out.println("THe interger is found at the index of   " + j);
				return true;
			}
			
		}
		return true;
	}
}
