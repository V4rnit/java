import java.util.*;

public class GenerateParenthesis{
	public static void backtrack(List<String> res, int n,String curr , int open, int close){
		if(curr.length() == 2*n){
			res.add(curr);
			return;
		}
		if(open < n){
			backtrack(res, n, curr + "(", open + 1, close);
		}
		if(close < open){
			backtrack(res, n, curr + ")", open, close + 1);
		}
	}
	public static List<String> generateParenthesis(int n){
		List<String> res = new ArrayList<>();
		backtrack(res, n, "", 0, 0);
		return res;
	}
	public static void main(String [] args){
		//Test Case 1
		List<String> caseOne = generateParenthesis(3);
		System.out.println(caseOne);

		//Test Case 2
		List<String> caseTwo = generateParenthesis(4);
		System.out.println(caseTwo);
	}
}
