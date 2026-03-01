class Solution{
	public void moveZeroes(int [] nums){
		int k = -1;

		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0){
				k = i;
				break;
			}
		}
		if(k == -1){
			return;
		}
		
		for(int j = k + 1; j < nums.length; j++){
			if(nums[j] != 0){
				//swap logic
				int temp = nums[k];
				nums[k] = nums[j];
				nums[j] = temp;
				k++;
			}
		}
	}
}
public class MovingZeros{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] nums = {0,1,0,3,12};
		
		sol.moveZeroes(nums);

		for(int num : nums){
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
