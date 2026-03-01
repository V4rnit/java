class Solution{
	public int removeDuplicates(int [] nums){
		int i = 0;

		for(int j = 1; j < nums.length; j++){
			if(nums[i] != nums[j]){
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
public class RemoveDuplicates{
	public static void main(String [] args){
        	int[] nums = {1, 1, 2};
		Solution sol = new Solution();
        	int k = sol.removeDuplicates(nums);

        	System.out.println("New length: " + k);
        	System.out.print("Modified array: ");
        	for (int i = 0; i < k; i++) {
            		System.out.print(nums[i] + " ");
        	}
	}
}
