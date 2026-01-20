import java.util.*;

class Solution{
	public int findDuplicate(int [] nums){
		int slow = nums[0];
		int fast = nums[0];
		while(true){
			slow = nums[slow];
			fast = nums[nums[fast]];
			if(slow == fast) break;
		}
		slow = nums[0];
		while(slow != fast){
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}
}
public class DuplicateNumber{
	public static void main(String [] args){
		int [] nums = {1,2,3,2,2};
		Solution sol = new Solution();
		int repeat = sol.findDuplicate(nums);
		System.out.println(repeat);
	}
}
