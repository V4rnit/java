import java.util.*;
class Solution{
	public int maxArea(int [] height){
		int l = 0;
		int r = height.length - 1;
		int max_area = 0;
		while(l < r){
			int curr_area = 0;
			int currHeight = Math.min(height[l], height[r]);
			curr_area = currHeight * (r - l);
			max_area = Math.max(max_area, curr_area);
			if(height[l] < height[r]){
				l++;	
			}
			else{
				r--;
			}
		}
		return max_area;
	}
}
public class ContainerWithMostWater{
	public static void main(String [] args){
		int [] heights = {1,8,6,2,5,4,8,3,7};
		Solution s = new Solution();
		System.out.println(s.maxArea(heights));
	}
}
