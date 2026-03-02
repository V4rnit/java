class Solution{
	public int makeChange(int [] coins, int amount){
		if(amount < 1)	{
			return 0;
		}
		
		int [][] dp = new int [coins.length + 1][amount + 1];

		for(int i = 1; i <= amount; i++){
			dp[0][i] = Integer.MAX_VALUE;
		}
		
		for(int i = 1; i <= coins.length; i++){
			for(int j = 1; j <= amount; j++){
				if(coins[i - 1] <= j && dp[i][j - coins[i - 1]] != Integer.MAX_VALUE){
					dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][ j - coins [i - 1]]);
				}
				else{
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return (dp[coins.length][amount] != Integer.MAX_VALUE) ? dp[coins.length][amount] : -1;
	}
}
public class CoinChange2DP{
	public static void main(String [] args){
		int [] coins1 = {1, 2, 5};
		int amount1 = 11;

		int [] coins2 = {2};
		int amount2 = 3;

		int [] coins3 = {1};
		int amount3 = 0;

		Solution sol = new Solution();

		System.out.println(sol.makeChange(coins1, amount1));
		System.out.println(sol.makeChange(coins2, amount2));
		System.out.println(sol.makeChange(coins3, amount3));

	}
}
