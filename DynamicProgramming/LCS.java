class Solution{
	public int longestCommonSubsequence(String text1, String text2){
		int len1 = text1.length();
		int len2 = text2.length();
		int [][] dp = new int [len1 + 1][len2 + 1];

		for(int i = 1; i <= len1; i++){
			for(int j = 1; j <= len2; j++){
				//Two options are that char was a hit 
				
				//1. If the char hit check the left vertical diag
				
				if(text1.charAt(i - 1) == text2.charAt(j - 1))	{
					dp[i][j] = 1 + dp[i - 1][j - 1];
				}
				//2. The char was not a hit
				else{
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[len1][len2];
	}
}
public class LCS{
	public static void main(String [] args){
		//Also test the code on leetcode
		String t1 = "abcde";
		String t2 = "ace";

		Solution sol = new Solution();

		int longest = sol.longestCommonSubsequence(t1, t2);

		System.out.println(longest);
	}
}
