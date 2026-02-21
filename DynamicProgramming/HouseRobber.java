//The way we approach this problem 
//is my remembering this
//i have 2 choices either i rob the curr house : nums[i] + total_loot[i - 2]
//i dont rob the current house: dp[i - 1]
//How i decide is by using Math.max not a greedy approach
class Solution{
	//Bottom Up without space optimization
	public int rob(int [] nums){
		if(nums.length == 2){
			return Math.max(nums[0], nums[1]);
		}
		int [] dp = new int [nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);

		for(int i = 2; i < nums.length; i++){
			dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
		}
		return (dp[dp.length - 1]);
	}

	//Bottom Up approach with Space optimizatoin
	public int robSpaceOptimized(int [] nums){
		if(nums.length == 0){
			return 0;
		}
		if(nums.length == 1){
			return(nums[0]);
		}
		int prev2 = nums[0];
		int prev1 = Math.max(nums[0], nums[1]);

		for(int i = 2; i < nums.length; i++){
			int currLoot = Math.max(nums[i] + prev2, prev1);
			prev2 = prev1;
			prev1 = currLoot;	
		}
		return prev1;
	}
}
public class HouseRobber{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] nums = {2, 7, 9, 3, 1};
		
		System.out.println(sol.rob(nums));
		System.out.println(sol.robSpaceOptimized(nums));
	}
}
