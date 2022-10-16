public class Solution {
	
	//Returns count of all the possible paths to reach
	// cell at row number m and column n
	// from the topmost left cell cell at (1,1)
	static int numberofpaths(int m ,int n) {
    	//If either row number is first or 
		// given column number is first
		if(m==1 || n==1) 
			return 1;
		//If diagonal movements are allowed then the last addditon is
		// required
		return numberofpaths(m-1,n) + numberofpaths(m , n-1);     
    /* The logic is that the case is broken into semi problems and for every 1 box 1 is added try for example with 2 ,3 on paper and you will get the answer 3
    }
    public static void main(String[] args) {
    	System.out.println(numberofpaths(2,3));    

    	
    }
}
