class Solution{
	public int coinChange(int [] coins, int amount){
		//Check if this amount in smaller than 1;
		if(amount < 1){
			return 0;
		}
		//Then create a dp array of size amount + 1
		int [] dp = new int [amount + 1];
		
		//Now loop on this dp array 
		for(int i = 1; i <= amount; i++){
			//Set dp[i] to max val (safety net)

			dp[i] = Integer.MAX_VALUE;
			
			//Now loop on the coins i have 
			for(int coin : coins){
				//check if this coins <= amount && is dp[i] solvable or not if not we try a diff coin (coin <= i)
				if(coin <= i && dp[i - coin] != Integer.MAX_VALUE){
					dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
				}
			}
		}
		//Now just return the coins need to make amount (if dp[amount] != Max value)
		return (dp[amount] != Integer.MAX_VALUE) ? dp[amount] : -1;
	}
}
public class CoinChange{
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Small amount
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        System.out.println(sol.coinChange(coins1, amount1)); 
        // Expected: 3 → 5 + 5 + 1

        // Test Case 2: Medium amount with multiple options
        int[] coins2 = {1, 3, 4, 7, 10};
        int amount2 = 25;
        System.out.println(sol.coinChange(coins2, amount2)); 
        // Expected: 4 → 10 + 10 + 4 + 1 or 7 + 7 + 7 + 4

        // Test Case 3: Larger amount with gaps (harder)
        int[] coins3 = {2, 5, 9, 10};
        int amount3 = 99;
        System.out.println(sol.coinChange(coins3, amount3)); 
        // Expected: 10 → One possible combo: 10*9 + 9 → 10 coins of 10 + 9
    }
}
