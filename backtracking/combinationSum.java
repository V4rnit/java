import java.util.*;

public class combinationSum{
	public static void findCombinations(int [] num, int target, List<List<Integer>> res, List<Integer> ds, int idx){
		if(idx == num.length){
			if(target == 0){
				res.add(new ArrayList<>(ds));
			}
			return;
		}
		if(num[idx] <= target){
			ds.add(num[idx]);
			findCombinations(num, target - num[idx], res, ds, idx);
			ds.remove(ds.size() - 1);
		}
		findCombinations(num, target, res, ds, idx + 1);
	}
	public static List<List<Integer>> generateCombinations(int [] num, int target){
		List<List<Integer>> ans = new ArrayList<>();
		findCombinations(num, target, ans, new ArrayList<>(), 0);
		return ans;
	}
	public static void main(String args[]){
		int [] nums = {2,3,7};
		int t = 7;

		System.out.println(generateCombinations(nums, t));
	}
}
