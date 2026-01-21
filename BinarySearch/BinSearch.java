class Solution{
	public int search(int [] nums, int target){
		if(nums.length == 0){
			return -1;
		}
		int l = 0;
		int r = nums.length - 1;
		while(l <= r){
			int mid = (l + r) / 2;
			if(nums[mid] == target){
				return mid;
			}
			else if(nums[mid] < target){
				l = mid + 1;
			}
			else{
				r = mid - 1;
			}
		}
		return -1;
	}
	public int searchRecursive(int [] nums, int target, int left, int right){
		if(left > right){
			return -1;
		}
		int mid = (left + right) /2;
		if(nums[mid] == target){
			return mid;
		}
		else if(nums[mid] < target){
			return searchRecursive(nums, target, mid + 1, right);
		}
		else{
			return searchRecursive(nums, target, left, mid - 1);
		}
	}
}
public class BinSearch{
	public static void main(String [] args){
		int [] nums = {-1, 0, 2, 3, 4, 5, 8, 10};
		int t = 8;
		Solution sol = new Solution();
		//Checking for Recursive Binary Search
		int idx = sol.searchRecursive(nums, t, 0, 7);

		System.out.println(idx);
		//Checking for iterative Binary Search
		int target = 0;
		int idx2 = sol.search(nums, target);
		System.out.println(idx2);
	}
}
