import java.util.*;

class Solution{
	public boolean isPalindrome(String s){
		int l = 0, r = s.length() - 1;
		while(l < r){
			while(l < r && !alphaNum(s.charAt(l))){
				l++;
			}
			while(l < r && !alphaNum(s.charAt(r))){
				r--;
			}
			if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
				return false;
			}
			l++;
			r--;
		}
		return true;
				
	}
	public boolean alphaNum(char c){
		return (c >= 'A' && c <= 'Z') ||
			(c >= 'a' && c <= 'z') ||
			(c >= '0' && c <= '9');
	}
}
public class ValidPalindrome{
	public static void main(String [] args){
		String a = "lol";
		Solution s = new Solution();

		System.out.println(s.isPalindrome(a));
	}
}
