/**
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
**/

public class PcountX{
	public static int countX(String str) {
		if (str.equals("x") && str.length() == 1) return 1;
		if (str.length() == 1 || str.length() == 0) return 0;
		
		if (str.substring(str.length() - 1, str.length()).equals("x")) return 1 + countX(str.substring(0, str.length() - 1));
		return 0 + countX(str.substring(0, str.length() - 1));
	}
	
	public static void main (String args[]){
		System.out.println(countX("xxhixx"));
		System.out.println(countX("xhixhix"));
		System.out.println(countX("hi"));
	}
}