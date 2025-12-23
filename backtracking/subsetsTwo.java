import java.util.*;
public class subsetsTwo{
	public static void backtrack(int [] nums, List<List<Integer>> res, List<Integer> ds, int start){
		if(res.contains(ds)){
			return;
		}
		res.add(new ArrayList<>(ds));
		for(int i = start; i < nums.length; i++)	{
			//Add the element
			ds.add(nums[i]);
			//Backtrack to pick another element
			backtrack(nums,res, ds, i + 1);
			//Remove the last element added
			ds.remove(ds.size() - 1);
		}
	}
	public static List<List<Integer>> findSubsets(int [] nums){
		Arrays.sort(nums);
		List<List<Integer>>  ans = new ArrayList<>();
		backtrack(nums, ans, new ArrayList<>(), 0);
		return ans;
	}
	public static void main(String [] args){
		//Test case 1
		int [] nums = {1,2,2};
		List<List<Integer>> subset = findSubsets(nums);
		System.out.println(subset);

		//Test case 2
		int [] arr = {1,2,1};
		List<List<Integer>> ans = findSubsets(arr);
		System.out.println(ans);
	}
}
