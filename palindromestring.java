package akshat2;

public class GFG {

	public static void main(String[] args) {
		String str = "abdcba";
		System.out.println(palin(str,0,str.length()-1));
			

	}
	static boolean palin(String s , int l , int r) {
		if(l>=r) 
			return true;
		if(s.charAt(l)!= s.charAt(r))
			return false;
		
		return palin(s , l+1,r-1);
	}
}
