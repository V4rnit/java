import java.util.*;
class Solution{
	public int longestConsecutive(int [] nums){
		//need to build by set first
		Set <Integer> seen = new HashSet<>();
		int longest = 0;
		for(int n : nums){
			seen.add(n);
		}
		for(int n : seen){
			if(!seen.contains(n-1)){
				int len = 1;
				while(seen.contains(n+len)){
					len++;
				}
				longest = Math.max(longest, len);
			}
		}
		return longest;
	}
}
public class LongestConsecutiveSequence{
	public static void main(String [] args){
		int [] nums = {100,4,200,1,3,2};
		Solution sol = new Solution();
		System.out.println(sol.longestConsecutive(nums));
	}
}
