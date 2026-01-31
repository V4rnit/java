class Solution{
	public int [] runningSum(int [] nums){
		int save = 0;
		int [] res = new int [nums.length];

		for(int i = 0; i < nums.length; i++){
			save += nums[i];
			res[i] += save;
		}
		return res;
	}
}
public class RunningSum{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] nums = {1, 2, 3, 4};
		int [] out = sol.runningSum(nums);

		for(int n : out){
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
