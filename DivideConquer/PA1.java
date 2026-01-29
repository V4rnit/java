import java.util.*;

//Problem is as followed
// 1. You are given a Lower Bound and an Upper bound
// 2. You need to check how many values lies within this point
// 3. Check if the count (frequency) of these values is greater than k.
// 4. If it is greater than K return True else False
// 5. Do this in both ways recursively and Iteratively.
class Solution{
	public boolean wrapper(int [] nums, int k, int lowerBound, int upperBound){
		int lower = GreaterThanK(nums, true, lowerBound);
		int upper = GreaterThanK(nums, false, upperBound);
		
		int frequency = upper - lower;

		return (frequency > k) ? true : false;
	}
	public int GreaterThanK(int [] nums, boolean LowerOrUpper, int bound){
		int low = 0;
		int high = nums.length - 1;
		int idx = nums.length;	

		while(low <= high){
			int mid = low + (high - low) / 2;
			if(nums[mid] > bound || (LowerOrUpper && nums[mid] >= bound)){
				high = mid - 1;
				idx = mid;
			}
			else{
				low = mid + 1;
			}
		}
		return idx;
	}
}
public class PA1{
	public static void main(String [] args){
		Solution sol = new Solution();
		//Test case - 1
		int [] nums = {1,2,3,4,5,6,7,8,9,10,12,20,30,32,99,101};
		int lowerBound = 7;
		int upperBound = 32;
		int k = 8;
		boolean ansOne = sol.wrapper(nums, k, lowerBound, upperBound);
		System.out.println(ansOne);
	}
}
