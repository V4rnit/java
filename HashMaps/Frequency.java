import java.util.*;

class Solution{
	public HashMap<Character, Integer> frequencyCounter(String s){
		HashMap<Character, Integer> map = new HashMap<>();

		for(char c : s.toCharArray()){
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		return map;
	}
}
public class Frequency{
	public static void main(String [] args){
		Solution s = new Solution();
		String word = "aabbccdd";
		HashMap <Character, Integer> map = s.frequencyCounter(word);

		System.out.println(map);
	}
}
