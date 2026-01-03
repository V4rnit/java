import java.util.*;
class Solution{
	public boolean isSubsequence(String s, String t){
		int i = 0;
		int j = 0;
		while(i < s.length() && j < t.length()){
			if(s.charAt(i) == t.charAt(j)){
				i++;
			}
			j++;
		}
		return (i == s.length()) ? true : false;
	}
}
public class IsSubsequence{
	public static void main(String [] args){
		String a = "acd";
		String b = "affecttd";
		Solution s = new Solution();

		System.out.println(s.isSubsequence(a,b));
	}
}
