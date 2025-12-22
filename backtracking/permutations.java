import java.util.*;
public class permutations{
	public static void backtrack(int [] nums, List<List<Integer>> res, List<Integer> ds){
		if(ds.size() == nums.length){
			res.add(new ArrayList<>(ds));
		}
		for(int i = 0; i < nums.length; i++){
			if(ds.contains(nums[i])){
				continue;
			}
			ds.add(nums[i]);
			backtrack(nums, res, ds);
			ds.remove(ds.size() - 1);
		}
	}
	public static List<List<Integer>> permute(int [] nums){
		List<List<Integer>> res = new ArrayList<>();
		backtrack(nums, res, new ArrayList<>());
		return res;
	}
	public static void main(String [] args){
		int [] nums = {1,2,3};
		List<List<Integer>> permutations = permute(nums);
		System.out.println(permutations);
	}
}
