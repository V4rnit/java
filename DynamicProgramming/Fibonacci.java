class Solution{
	//Brute force solution using Recursion 
	//TC -> 2^n
	public int FibBrute(int n){
		if(n <= 1){
			return n;
		}
		return FibBrute(n - 1) + FibBrute(n - 2);
	}

	//DP with memoization (Top down Approach with extra memory)
	public int FibMemoization(int n){
		int [] memo = new int [n + 1];
		int ans = helper(n, memo);
		return ans;
	}
	public int helper(int n, int [] memo){
		if(n <= 1){
			return n;
		}
		//return memo at n back to the last caller
		if(memo[n] != 0){
			return memo[n];
		}
		memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
		return memo[n];
	}
	
	//DP with Tabulation(bottom up approach with extra memory)
	public int FibTabulation(int n){
		if(n <= 1){
			return n;
		}
		int [] dp = new int [n + 1];
		dp[0] = 0;
		dp[1] = 1;

		for(int i = 2; i < n + 1; i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	//DP with Tabulation (bottom up) no extra memory usage
	public int FibTabulationNoMemory(int n){
		if(n <= 1){
			return n;
		}
		int prev1 = 1;
		int prev2 = 0;

		for(int i = 2; i < n + 1; i++){
			int curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}
		return prev1;
	}
}
public class Fibonacci{
	public static void main(String [] args){
		//Test all solution on leetcode
		Solution sol = new Solution();

		int n = 8;
		System.out.println(sol.FibBrute(n));
		System.out.println(sol.FibMemoization(n));
		System.out.println(sol.FibTabulation(n));
		System.out.println(sol.FibTabulationNoMemory(n));
	}
}
