/**
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
**/

public class PcountAbc{
	public static int countAbc(String str) {
		if (str.equals("aba") || str.equals("abc")) return 1;
		if (str.length() < 1) return 0;
		
		if (str.length() >= 3)
		if (str.substring(str.length() - 3, str.length()).equals("abc") || str.substring(str.length() - 3, str.length()).equals("aba")) return 1 + countAbc(str.substring(0, str.length()-1));
		return countAbc(str.substring(0,str.length()-1));
	}
	public static void main (String args[]){
		System.out.println(countAbc("abc"));
		System.out.println(countAbc("abcxxabc"));
		System.out.println(countAbc("abaxxaba"));
	}
}