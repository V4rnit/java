import java.util.*;

class Subsets{
	public static List<List<Integer>> generateSubsets(int [] nums){
		List<List<Integer>> res = new ArrayList<>();

		backtrack(res, new ArrayList<>(), nums, 0);
		return res;
	}
	public static void backtrack(List<List<Integer>> res, List<Integer> temp, int [] nums, int start){
		res.add(new ArrayList<>(temp));

		for(int i = start; i < nums.length; i++){
			//case of adding the element
			temp.add(nums[i]);
			//Exploring all paths
			backtrack(res, temp, nums, i + 1);

			//case of not including a number
			temp.remove(temp.size() - 1);
		}
	}
	public static void main(String args[]){
		int [] nums = {1,2,3};
		List<List<Integer>> subsets = generateSubsets(nums);

		System.out.println(subsets);
	}
}
