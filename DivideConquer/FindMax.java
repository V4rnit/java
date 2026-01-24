import java.util.*;
//Given an unsorted array of intergers return the Max Element using divide and conquer
class Solution{
	//Time complexity -> O(n) & Space Complexity O(1)
	int findMaxBrute(int [] nums){
		//if the nums array is empty
		int n = nums.length;
		if(n == 0){
			return -1;
		}
		int max = nums[0];
		for(int i = 1; i < n; i++){
			if(nums[i] > max){
				max = nums[i];
			}
		}
		return max;
	}
	
	//Time Complexity -> O(n) & Space Complexity 0(logn)
	int findMaxDivide(int [] nums, int left, int right){
		int n = nums.length;
		
		if(n == 0){
			return -1;
		}
		if(left == right){
			return nums[left];
		}
		int mid = (left + right) / 2;
		int l = findMaxDivide(nums, left, mid);
		int r = findMaxDivide(nums, mid + 1, right);

		return Math.max(l, r);
	}
}
public class FindMax{
	public static void main(String [] args){
		Solution sol = new Solution();
		//Test Case 1 
		int [] nums1 = {10,2,42,132,99,1,3,99};
		System.out.println(sol.findMaxBrute(nums1));

		//Test case 2
		int [] nums2 = {10,2,32,45,991,95,10,1};
		System.out.println(sol.findMaxDivide(nums2, 0, nums2.length - 1));
	}
}
