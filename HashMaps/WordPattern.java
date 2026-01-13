import java.util.*;

class Solution{
	public boolean wordPattern(String pattern, String s){
		String [] ss = s.split(" ");
		if(pattern.length() != ss.length){
			return false;
		}
		HashMap <Character, String> mapPS = new HashMap<>();
		HashMap <String, Character> mapSP = new HashMap<>();

		for(int i = 0; i < pattern.length(); i++){
			char c1 = pattern.charAt(i);
			String s1 = ss[i];
			if(mapPS.containsKey(c1)){
				//Since String is an object i need to compare them using a in built equals() to method
				if(!mapPS.get(c1).equals(s1)){
					return false;
				}
			}
			else{
				mapPS.put(c1, s1);
			}
			if(mapSP.containsKey(s1)){
				if(mapSP.get(s1) != c1){
					return false;
				}
			}
			else{
				mapSP.put(s1, c1);
			}
			
		}
		return true;
	}
}
public class WordPattern{
	public static void main(String [] args){
		String pattern = "abba";
		String s = "dog cat cat dog";
		Solution sol = new Solution();
		
		System.out.println(sol.wordPattern(pattern, s));
	}
}
