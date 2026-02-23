//This time the houses are in a circle
//Everything is the same 
//But since the houses are in a circle we can
//1. Skip the first house (rob the last house)
//2. Skip the last house (rob the first house)

class Solution{
	public int rob(int [] nums){
		if(nums.length == 1){
			return nums[0];
		}
		if(nums.length == 2){
			return Math.max(nums[0], nums[1]);
		}
		int [] skipFirst = new int [nums.length - 1];
		int [] skipLast = new int [nums.length - 1];

		for(int i = 0; i < nums.length - 1; i++){
			skipFirst[i] = nums[i + 1];
			skipLast[i] = nums[i];
		}
		int case1 = helperOne(skipFirst);
		int case2 = helperOne(skipLast);
		
		int optimalOne = helperTwo(skipFirst);
		int optimalTwo = helperTwo(skipLast);

		//return Math.max(case1, case2);
		return Math.max(optimalOne, optimalTwo);
	}

	public int helperOne(int [] nums){
		if(nums.length == 1){
			return nums[0];
		}
		if(nums.length == 2){
			return Math.max(nums[0], nums[1]);
		}
		int [] dp = new int[nums.length];

		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for(int i = 2; i < nums.length; i++){
			dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
		}
		return dp[dp.length - 1];
	}
	
	public int helperTwo(int [] nums){
		if(nums.length == 1){
			return nums[0];
		}
		if(nums.length == 2){
			return Math.max(nums[0], nums[1]);
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
public class HouseRobber2{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] houses = {1, 2, 3, 1};
		System.out.println(sol.rob(houses));
	}
}
