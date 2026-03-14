class Solution{
	public int minDistance(String word1, String word2){
		int m = word1.length();
		int n = word2.length();
		
		int [][] dp = new int [m + 1][n + 1];
		for(int i = 1; i < m; i++){
			dp[i][0] = i;
		}
		for(int j = 1; j < n; j++){
			dp[0][j] = j;
		}

		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				if(word1.charAt(i - 1) == word2.charAt(j - 1)){
					dp[i][j] = dp[i - 1][j - 1];
				}
				else{
					int delete = dp[i - 1][j];
					int insert = dp[i][j - 1];
					int replace = dp[i - 1][j - 1];

					dp[i][j] = 1 + Math.min(delete, Math.min(insert, replace));
				}
			}
		}
		return dp[m][n];
	}
}
public class EditDistance{
	public static void main(String [] args){
		Solution sol = new Solution();
		String word1 = "horse";
		String word2 = "ros";

		String text1 = "intention";
		String text2 = "execution";

		System.out.println("Test case 1: " + sol.minDistance(word1, word2));
		System.out.println("Test case 2: " + sol.minDistance(text1, text2));
	}
}
