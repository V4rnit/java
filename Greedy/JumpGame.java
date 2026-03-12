class Solution{
	public boolean canJump(int [] nums){
		int i = 0;
		int maxJump = 0;

		while(i < nums.length){
			if(i > maxJump){
				return false;
			}
			maxJump = Math.max(maxJump, i + nums[i]);
			i++;
		}
		return true;
	}
}
public class JumpGame{
	public static void main(String [] args){
		Solution sol = new Solution();

		int [] num1 = {2, 3, 1, 1, 4};
		int [] num2 = {3, 2, 1, 0, 4};

		System.out.println("Test case 1 " + sol.canJump(num1));

		System.out.println("Test case two " + sol.canJump(num2));
	}
}
