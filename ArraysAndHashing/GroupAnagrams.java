import java.util.*;

class Solution{
	public List<List<String>> groupAnagrams(String [] strs){
		Map <String, List<String>> res = new HashMap<>();
		for(String s : strs){
			int [] count = new int [26];
			for(char c : s.toCharArray()){
				count[c - 'a']++;
			}
			String key = Arrays.toString(count);
			res.putIfAbsent(key, new ArrayList<>());
			res.get(key).add(s);
		}
		return new ArrayList<>(res.values());
	}
}
public class GroupAnagrams{
	public static void main(String [] args){
		String [] s =  {"cat", "act", "pots", "tops", "stop", "hat"};
		Solution sol = new Solution();
		List<List<String>> res = sol.groupAnagrams(s);
		
		System.out.println(res);
	}
}
