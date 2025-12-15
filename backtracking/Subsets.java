import java.util.*;

public class Subsets{
	public static void wrapper(int [] nums, int idx,List<List<Integer>> res,  List<Integer> ds){
		res.add(new ArrayList<>(ds));
		for(int i = idx; i < nums.length; i++){
			ds.add(nums[i]);
			wrapper(nums, i + 1, res, ds);
			ds.remove(ds.size() - 1);
		}
	}
	public static List<List<Integer>> allSubsets(int [] nums){
		List<List<Integer>> ans = new ArrayList<>();
		wrapper(nums, 0, ans, new ArrayList<>());
		return ans;
	}
	public static void main(String args[]){
		int [] nums = {1,2,3};

		System.out.println(allSubsets(nums));
	}
}
