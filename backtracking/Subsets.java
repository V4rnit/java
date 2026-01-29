import java.util.*;
class Solution{
	public List<List<Integer>> allSubsets(int [] nums, int idx, List<List<Integer>> ans, List<Integer> ds){
		//because empty array is also a subset
		ans.add(new ArrayList<>(ds));
		for(int i = idx; i < nums.length; i++){
			ds.add(nums[i]);
			allSubsets(nums, i + 1, ans, ds);
			ds.remove(ds.size() - 1);
		}
		return ans;
	}
	public List<List<Integer>> subsets (int [] nums){
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		List <List<Integer>> res = allSubsets(nums, 0, ans, ds);
		return res;
	}
}
public class Subsets{
	public static void main(String [] args){
		Solution sol = new Solution();
		int [] nums = {1,2,3};
		
		List<List<Integer>> res = sol.subsets(nums);

		System.out.println(res);
	}
}
