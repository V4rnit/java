import java.util.*;

class Solution{
	public boolean containsDuplicate(int [] nums){
		HashMap <Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			if(map.get(nums[i]) > 1){
				return true;

			}
		}
		return false;
	}
}
public class ContainsDuplicate{
	public static void main(String [] args){
		int [] nums = {1, 2, 3, 1};
		Solution sol = new Solution();
		System.out.println(sol.containsDuplicate(nums));
	}
}
