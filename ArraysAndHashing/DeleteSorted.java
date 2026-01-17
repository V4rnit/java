import java.util.*;

class Solution{
	public void deleteSorted(int [] nums, int val){
		int flag = -1;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == val){
				flag = i;
				break;
			}
		}
		//Value was not found
		if(flag == -1){
			return;
		}
		for(int i = flag; i < nums.length -1 ; i++){
			nums[i] = nums[i+1];
		}
		nums[nums.length - 1] = 0;
	}
}
public class DeleteSorted{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] arr = new int [4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		sol.deleteSorted(arr, 1);
		
		for(int n : arr){
			System.out.println(n);
		}
	}
}
