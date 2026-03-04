class Solution{
	public int computeRobbery(int [] weights, int [] values, int capacity, int n)	{
		
		int [][] dp = new int[n + 1][capacity + 1];
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= capacity; j++){
				//Idea is if i can take this current item whoose weight is smaller than the current knapsack capacity
				//Well take it dummy ( take the max of last weight same col and the curr item and check the remained
				// in the last row as the items are finite ).
				if(weights[i - 1] <= j){
					dp[i][j] = Math.max(values[i - 1] + dp[i- 1][j - weights[i - 1]], dp[i - 1][j]);
				}
				//the opposite is hey i cannot take the item so just copy the robbery from last row same col 
				//when the capacity was j and the robbery made for the last item seen.
				else{
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[n][capacity];
	}

}
public class KnapSackZeroOne{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] weights = {20, 30, 10};
		int [] values = {100, 120, 60};
		
		System.out.println(sol.computeRobbery(weights, values,50 ,values.length));
	}
}
