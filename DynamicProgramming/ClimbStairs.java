//The proble is asking that you are given an int N which represent the point within the stairs you want to reach.
//You can either hop once or hop twice.
//Your task is to return all the possible ways you can reach this point within the stairs.
//N will never be passed as 0 to the function initially
//Example n = 3
//Ans = 1 + 1 + 1 | 2 + 1 | 1 + 2 -> total 3 possible ways to reach to the N point in the stairs
import java.util.*;
class Solution{
	//Solve this using Top - Down (Memoization)
	//TC -> O(n)
	//SC -> O(n) + O(n) = O(n) for call stack + memoization array
	public int climbStairs(int n){
		int [] track = new int [n + 1];
		Arrays.fill(track, -1);
		return memoization(n, track);
	}
	public int memoization(int n, int [] track){
		if(n == 0 || n == 1){
			return 1;
		}
		if(track[n] != -1){
			return track[n]; //back to the last caller
		}
		track[n] = memoization(n - 1, track) + memoization(n - 2, track);
		return track[n];
	}

	//DP approach Bottom - Up (Tabulation with extra memory)
	public int climbStairsTabulation(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		int [] track = new int [n + 1];
		track[0] = 1;
		track[1] = 1;
		for(int i = 2; i <= n; i++){
			track[i] = track[i - 1] + track[i - 2];
		}
		return track[n];
	}
	public int climbStaisOptimal(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		int prev1 = 1;
		int prev2 = 1;
		for(int i = 2; i <= n; i++){
			int curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}
		return prev1;
	}
}
public class ClimbStairs{
	public static void main(String [] args){
		
    		Solution sol = new Solution();
		int n = 3;
    		System.out.println(sol.climbStairs(n));            // memoization
    		System.out.println(sol.climbStairsTabulation(n));  // tabulation
    		System.out.println(sol.climbStaisOptimal(n));      // space optimized
	}
}
