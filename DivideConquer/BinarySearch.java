class Solution{
	public int search(int [] nums, int target){
		int low = 0;
		int high = nums.length - 1;

		while(low <= high){
			int mid = low + (high - low) / 2;
			if(nums[mid] == target){
				return mid;
			}
			else if(nums[mid] > target){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		return - 1;
	}
}
public class BinarySearch{
	public static void main(String [] args){
		int [] arr =  {-1, 0, 2, 3, 6, 7, 10, 29, 100};
		Solution sol = new Solution();
		//Should return the index 7
		System.out.println(sol.search(arr, 29));
	}
}
