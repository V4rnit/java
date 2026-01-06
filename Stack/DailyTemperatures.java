import java.util.*;
class Solution{
	public int [] dailyTemperatures(int [] temperatures){
		Stack <Integer> s = new Stack<>();
		int [] res = new int [temperatures.length];

		for(int i = temperatures.length - 1; i >= 0; i--){
			while(!s.empty() && temperatures[i] >= temperatures[s.peek()]){
				s.pop();
			}
			if(!s.empty()){
				res[i] = s.peek() - i;
			}
			s.push(i);
		}
		return res;
	}
}
public class DailyTemperatures{
	public static void main(String [] args){
		int [] t = {30, 40, 50, 60};
		Solution s = new Solution();
		int [] ans = s.dailyTemperatures(t);
		
		for(int n : ans){
			System.out.println(n);
		}
	}
}
