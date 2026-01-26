class Solution{
	public int findPeakElement(int [] nums){
		int left = 0;
		int right = nums.length - 1;
		
		while(left < right){
			int mid = left + (right - left) / 2;
			if(nums[mid] < nums[mid + 1]){
				left = mid + 1;
			}
			//The inverse is nums[mid] >= nums[mid + 1]
			//If this is the case right = mid because right might be the peak itself
			else{
				right = mid;
			}
		}
		return left;
	}
}
public class FindPeakElement{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] nums = {1, 2, 3, 1};
		//out should be 2
		System.out.println(sol.findPeakElement(nums));
	}
}
