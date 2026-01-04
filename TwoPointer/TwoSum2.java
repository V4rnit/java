class Solution{
	public int [] twoSum(int [] numbers, int target){
		int l = 0, r = numbers.length - 1;
		int currSum = 0;
		while(l < r){
			currSum = numbers[l] + numbers[r];
			if(currSum == target){
				return new int [] {l + 1, r + 1};
			}
			else if(currSum < target){
				l++;
			}
			else{
				r--;
			}
		}
		return new int [0];
	}
}
public class TwoSum2{
	public static void main(String [] args){
		int [] nums = {1,2,3,4};
		int t = 3;
		Solution s = new Solution();
		int [] res = s.twoSum(nums, t);

		for(int n : res){
			System.out.println(n);
		}
	}
}
