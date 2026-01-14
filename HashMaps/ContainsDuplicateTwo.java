import java.util.*;

class Solution{
	public boolean containsNearbyDuplicate(int [] nums, int k){
		HashMap <Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				int distance = Math.abs(i - map.get(nums[i]));
				if (distance <= k){
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}
}
public class ContainsDuplicateTwo{
	public static void main(String [] args){
		int [] nums = {1,2,3,1};
		Solution sol = new Solution();
		System.out.println(sol.containsNearbyDuplicate(nums, 3));
	}
}
