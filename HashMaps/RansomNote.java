import java.util.*;

class Solution{
	public boolean canConstruct(String ransomNote, String magazine){
		HashMap <Character, Integer> map = new HashMap<>();
		
		//Building the frequency HashMap
		for(Character c : magazine.toCharArray()){
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for(Character c : ransomNote.toCharArray()){
			if(!map.containsKey(c) || map.get(c) == 0){
				return false;
			}
			map.put(c, map.get(c) - 1);
		}
		return true;
	}
}
public class RansomNote{
	public static void main(String [] args){
		String ransomNote = "aa";
		String magazine = "ab";
		Solution s = new Solution();
		System.out.println(s.canConstruct(ransomNote, magazine));
	}
}
