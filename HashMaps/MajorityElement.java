import java.util.*;

class Solution{
	public int majorityElement(int [] nums){
		HashMap <Integer, Integer> map = new HashMap<>();

		for(int n : nums){
			map.put(n, map.getOrDefault(n, 0) + 1);
			if(map.get(n) >= nums.length/2){
				return n;
			}
		}
		return -1;
		
	}
}

public class MajorityElement{
	public static void main(String [] args){
		int [] nums = {1,1,1,2,2};
		Solution s = new Solution();
		int ans = s.majorityElement(nums);
		System.out.println(ans);
	}
}
