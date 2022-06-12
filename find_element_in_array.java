package akshat2;

public class class3 {
	public static void main(String[] args) {
		int[] arr = {13,45,6,789,67,345};
		find( arr, 6);
		
	}
		static void find(int[] arr, int tofind) {
			int i=0;
			int start = arr[i];
			System.out.println(start)
			;System.out.println(tofind);
			for( i =0;i < arr.length;i++) {
				if( tofind ==arr[i]) {
					System.out.println("The value is found at index  " + i);		
				}
				else{
					System.out.println("Memeber not found");
			}
		}
}
