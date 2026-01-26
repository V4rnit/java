class Solution{
	//same problem but this time including x
	public boolean  greaterThanOrX(int [] nums, int x, int k){
		int low = 0;
		int high = nums.length - 1;
		int idx = nums.length;

		while(low <= high){
			int mid = low + (high - low) / 2;
			if(nums[mid] < x){
				low = mid + 1;
			}
			else{
				high = mid - 1;
				idx = mid;
			}
		}
		return ((nums.length - idx) > k) ? true : false;
	}
}
public class GreaterThanOrX{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] arr = {1,2,3,5,19,20,23,34,55};
		
		System.out.println(sol.greaterThanOrX(arr, 23, 2));
	}
}
