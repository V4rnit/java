class Solution{
	//Brute force solution using Recursion 
	//TC -> 2^n
	public int FibBrute(int n){
		if(n <= 1){
			return n;
		}
		return FibBrute(n - 1) + FibBrute(n - 2);
	}

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
}
public class Fibonacci{
	public static void main(String [] args){
		Solution sol = new Solution();

		int n = 8;
		System.out.println(sol.FibBrute(n));
		System.out.println(sol.FibMemoization(n));
	}
}
