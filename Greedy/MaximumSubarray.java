class Solution{
	public int Kadene(int [] nums){
		if(nums.length == 0 || nums == null){
			return 0;
		}
		int maxSum = nums[0];
		int currSum = nums[0];

		for(int i = 0; i < nums.length; i++){
			currSum = Math.max(nums[i], currSum + nums[i]);
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}
}
public class MaximumSubarray{
	public static void main(String [] args){
		int [] nums = {-2, -1, -3, 4, -1, 2, 1, -5, 4};
		Solution sol = new Solution();
		System.out.println(sol.Kadene(nums));
	}
}
