import java.util.*;
class Solution{
	public boolean isIsomorphic(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		HashMap <Character, Character> mapS_T = new HashMap<>();
		HashMap <Character, Character> mapT_S= new HashMap<>();
		
		for(int i = 0; i < s.length(); i++){
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if(mapS_T.containsKey(c1)){
				if(mapS_T.get(c1) != c2){
					return false;
				}
			}
			else{
				mapS_T.put(c1, c2);
			}
			
			if(mapT_S.containsKey(c2)){
				if(mapT_S.get(c2) != c1){
					return false;
				}
			}
			else{
				mapT_S.put(c2, c1);
			}
		}
		return true;
	}
}
public class IsomorphicStrings{
	public static void main(String [] args){
		Solution s = new Solution();
		System.out.println(s.isIsomorphic("egg", "add"));

	}
}
