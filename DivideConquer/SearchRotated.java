class Solution{
	public int search (int [] nums, int target){
		int low = 0;
		int high = nums.length - 1;
		while(low <= high){
			int mid = low + (high - low) / 2;
			if(nums[mid] == target){
				return mid;
			}
			else if(nums[mid] >= nums[low]){
				if(target >= nums[low] && target < nums[mid]){
					high = mid - 1;
				}
				else{
					low = mid + 1;
				}
			}
			else{
				if(target > nums[mid] && target <= nums[high]){
					low = mid + 1;
				}
				else{
					high = mid - 1;
				}
			}
		}
		return -1;
	}
}
public class SearchRotated{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] nums = {4,5,6,7,0,1,2};
		int t = 0;
		//Should print out 4
		System.out.println(sol.search(nums, t));
	}
}
