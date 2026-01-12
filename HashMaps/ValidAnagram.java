import java.util.*;

class Solution{
	public boolean isAnagram(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		HashMap <Character, Integer> mapS = new HashMap<>();
		HashMap <Character, Integer> mapT = new HashMap<>();

		for(char c : s.toCharArray()){
			mapS.put(c, mapS.getOrDefault(c, 0) + 1 );
		}
		for(char c : t.toCharArray()){
			mapT.put(c, mapT.getOrDefault(c, 0) + 1);
		}
		return (mapS.equals(mapT)) ? true : false;
	}
}
public class ValidAnagram{
	public static void main(String [] args){
		String s = "anagram";
		String t = "nagaram";
		Solution a = new Solution();
		
		System.out.println(a.isAnagram(s, t));
	}
}
