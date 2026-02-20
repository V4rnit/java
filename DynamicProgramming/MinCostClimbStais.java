class Solution{
	//Bottom Up Solution with no space optimization
	public int minCost(int [] cost){
		//if(cost.length <= 2){
		//	return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
		//}
		int [] dp = new int[cost.length];

		dp[0] = cost[0];
		dp[1] = cost[1];

		for(int i = 2; i < cost.length; i++){
			dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
		}
		return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
	}
}
public class MinCostClimbStais{
	public static void main(String[] args){
		Solution sol = new Solution();
		//Out should be 6
		int [] cost = {1,100,1,1,1,100,1,1,100,1};

		System.out.println(sol.minCost(cost));
	}
}
