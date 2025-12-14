import java.util.*;

class Subsets{
	public static List<List<Integer>>  generateSubsets(int [] nums){
		List<List<Integer>> result = new ArrayList<>();

		backtrack(result, new ArrayList<>(), nums, 0);

		return result;
	}
	public static void backtrack(List<List<Integer>> result, List<Integer> temp, int [] nums, int start){
		result.add(new ArrayList<>(temp));
		
		for(int i = start; i < nums.length; i++){
			//case of including the number
			temp.add(nums[i]);

			//Backtracking the new subset
			backtrack(result, temp, nums, i + 1);

			//case of not including the number
			temp.remove(temp.size() - 1);
		}
	}
	public static void main(String args[]){
		int [] num = {1,2,3};
		List<List<Integer>> result = generateSubsets(num);

		System.out.println(result);
	}
}
