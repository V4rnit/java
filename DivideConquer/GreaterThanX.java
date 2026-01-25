//The question is that given a sorted arr 
//Find if the arr has values which are greater than x 
//the amount of these values needs to be >= k
class Solution{
	//Time complexity -> O(n) & Space Complexity O(1)
	public boolean hasAtLeastKGreaterThanX(int [] arr, int x, int k){
		int low = 0;
		int high = arr.length-1;
		int idx = arr.length;

		while(low <= high){
			int mid = low + (high - low) / 2;
			if(arr[mid] > x){
				high = mid - 1;
				idx = mid;
			}
			else{
				low = mid + 1;
			}
		}
		int count = arr.length - idx;
		return (count >= k) ? true : false;
	}
}
public class GreaterThanX{
	public static void main(String [] args){
		int [] nums = {1,2,3,4,5,6,7,8,9,10,20,40,60,70};
		Solution sol = new Solution();
		System.out.println(sol.hasAtLeastKGreaterThanX(nums, 10, 4));
	}
}
